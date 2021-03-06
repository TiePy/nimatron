/*
 * This file is based on example provided by the IntelliJ Platform SDK DevGuide.
 * Copyright 2000-2020 JetBrains s.r.o. and other contributors.
 * Use of original example source code is governed by the Apache 2.0 license.
 *
 * Copyright 2020 TiePy Ltd. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Nimatron, a Nim plug-in for IDEA platform IDEs.
 *
 * Nimatron is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.  TiePy Ltd designates this
 * particular file as subject to the "Classpath" exception as provided
 * by TiePy Ltd in the LICENSE file that accompanied this code.
 *
 * Nimatron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Nimatron.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Please contact TiePy Ltd, 19 Lyall Way, Laurencekirk, AB30 1FU, UK
 * or visit www.tiepy.com if you need additional information or have any
 * questions.
 */

package com.tiepy.nimatron.syntaxHighlighter;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import java.util.Stack;

%%

%class NimSyntaxLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

OPR=[=\+\-\*/<>@$~&%\|\!\?\^\.\:\\]+

DIGIT=[0-9]
ALPHA=[A-Za-z\u0080-\u00ff]
IDENT={ALPHA}(_|{ALPHA}|{DIGIT})*

BLOCK_COMMENT_BEGIN=#\[
BLOCK_COMMENT_END=\]#
BLOCK_DOC_COMMENT_BEGIN=##\[
BLOCK_DOC_COMMENT_END=\]##

CRLF=\n|\r|\r\n
WHITE_SPACE=[\ \t\f]

HEX_DIGIT=[0-9A-Fa-f]
OCT_DIGIT=[0-7]
BIN_DIGIT=[01]
HEX_LIT=0(x|X){HEX_DIGIT}(_|{HEX_DIGIT})*
DEC_LIT={DIGIT}(_|{DIGIT})*
OCT_LIT=0o{OCT_DIGIT}(_|{OCT_DIGIT})*
BIN_LIT=0(b|B){BIN_DIGIT}(_|{BIN_DIGIT})*

INT_LIT={HEX_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT}
INT8_LIT={INT_LIT}'?(i|I)8
INT16_LIT={INT_LIT}'?(i|I)16
INT32_LIT={INT_LIT}'?(i|I)32
INT64_LIT={INT_LIT}'?(i|I)64

UINT_LIT={INT_LIT}'?(u|U)
UINT8_LIT={INT_LIT}'?(u|U)8
UINT16_LIT={INT_LIT}'?(u|U)16
UINT32_LIT={INT_LIT}'?(u|U)32
UINT64_LIT={INT_LIT}'?(u|U)64

DIGITS={DEC_LIT}
EXPONENT=(e|E)(\+|\-)?{DIGITS}
FLOAT_LIT={DIGITS}((\.{DIGITS}{EXPONENT}?)|{EXPONENT})
FLOAT32_SUFFIX=(f|F)(32)?
FLOAT64_SUFFIX=((f|F)64)|d|D
FLOAT32_LIT=({HEX_LIT}'{FLOAT32_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT32_SUFFIX})
FLOAT64_LIT=({HEX_LIT}'{FLOAT64_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT64_SUFFIX})

BOOL_LIT=true|false

NIL=nil

NUM_LIT={INT_LIT}|{INT8_LIT}|{INT16_LIT}|{INT32_LIT}|{INT64_LIT}|{UINT_LIT}
|{UINT8_LIT}|{UINT16_LIT}|{UINT32_LIT}|{UINT64_LIT}|{FLOAT_LIT}|{FLOAT32_LIT}
|{FLOAT64_LIT}|{BOOL_LIT}|{NIL}

OPEN_BRACKET =\{|\[|(\[\.)|(\{\.)|(\(\.)|(\[:)
CLOSE_BRACKET=\}|\]|(\.\])|(\.\})|(\.\))
BRACKET={OPEN_BRACKET}|{CLOSE_BRACKET}

OPEN_PARENTHESIS=\(
CLOSE_PARENTHESIS=\)
PARENTHESIS={OPEN_PARENTHESIS}|{CLOSE_PARENTHESIS}

C_SEMICOLON=;
C_COMMA=,
C_GRAVE_ACCENT=`

KEYW=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue
|converter|defer|discard|distinct|div|do|elif|else|end|enum|except|export
|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let
|macro|method|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref
|return|shl|shr|static|template|try|tuple|type|using|var|when|while|xor|yield

%{

// -----------------------------------------------------------------------------
// State stack
// -----------------------------------------------------------------------------

private final Stack<Integer> stateStack = new Stack<Integer>();

/**
 * Pushes new state onto stack and sets parser to begin new state.
 * @param newState New parser state.
 * @return New stack size.
 */
private int pushState(int newState) {
    stateStack.push(yystate());
    yybegin(newState);
    return stateStack.size();
}

/**
 * Pops previous state from stack.
 * @return Previous state.
 */
private int popState() {
    yybegin(stateStack.pop());
    return stateStack.size();
}

%}

%state YYINITIAL
%state LINE_COMMENT
%state BLOCK_COMMENT
%state BLOCK_DOC_COMMENT
%state DISCARD_COMMENT
%state STRING_LITERAL
%state TRIPLE_STRING_LITERAL
%state RAW_STRING_LITERAL
%state GENERALIZED_STRING_LITERAL
%state GENERALIZED_TRIPLE_STRING_LITERAL
%state CHARACTER_LITERAL

%%

<YYINITIAL> {
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); return NimSyntaxTypes.COMMENT; }
    #                           { pushState(LINE_COMMENT); return NimSyntaxTypes.COMMENT; }
    discard\ \"\"\"             { pushState(DISCARD_COMMENT); return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    {KEYW}                      { return NimSyntaxTypes.KEYW; }
    r\"                         { pushState(RAW_STRING_LITERAL); return NimSyntaxTypes.STR_LIT; }
    \"\"\"                      { pushState(TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STR_LIT; }
    \"                          { pushState(STRING_LITERAL); return NimSyntaxTypes.STR_LIT; }
    '                           { pushState(CHARACTER_LITERAL); return NimSyntaxTypes.STR_LIT; }
    {NUM_LIT}                   { return NimSyntaxTypes.NUM_LIT; }
    {OPR}                       { return NimSyntaxTypes.OPR; }
    {IDENT}                     { return NimSyntaxTypes.IDENT; }
    {IDENT}\"                   { pushState(GENERALIZED_STRING_LITERAL); return NimSyntaxTypes.STR_LIT; }
    {IDENT}\"\"\"               { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STR_LIT; }
    {BRACKET}                   { return NimSyntaxTypes.BRACKET; }
    {PARENTHESIS}               { return NimSyntaxTypes.PARENTHESIS; }
    {C_SEMICOLON}               { return NimSyntaxTypes.C_SEMICOLON; }
    {C_COMMA}                   { return NimSyntaxTypes.C_COMMA; }
    {C_GRAVE_ACCENT}            { return NimSyntaxTypes.C_GRAVE_ACCENT; }
    .                           { return TokenType.WHITE_SPACE; }
}

<LINE_COMMENT> {
    .                           { return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { popState(); return NimSyntaxTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_COMMENT_END}         { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_END}     { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<DISCARD_COMMENT> {
    \"\"\"                      { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<STRING_LITERAL> {
    \\\\                        { return NimSyntaxTypes.STR_LIT; }
    \\\"                        { return NimSyntaxTypes.STR_LIT; }
    \"                          { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return NimSyntaxTypes.STR_LIT; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}

<RAW_STRING_LITERAL> {
    \"\"                        { return NimSyntaxTypes.STR_LIT; }
    \"                          { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                        { return NimSyntaxTypes.STR_LIT; }
    \"                          { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return NimSyntaxTypes.STR_LIT; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}

<CHARACTER_LITERAL> {
    \\\\                        { return NimSyntaxTypes.STR_LIT; }
    \\\'                        { return NimSyntaxTypes.STR_LIT; }
    '                           { popState(); return NimSyntaxTypes.STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STR_LIT; }
}
