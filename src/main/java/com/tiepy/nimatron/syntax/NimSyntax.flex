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

package com.tiepy.nimatron.syntax;

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

CRLF=\n|\r|\r\n
WHITE_SPACE=[\ \t\f]
BLOCK_COMMENT_BEGIN=#\[
BLOCK_COMMENT_END=\]#
BLOCK_DOC_COMMENT_BEGIN=##\[
BLOCK_DOC_COMMENT_END=\]##
DIGIT=[0-9]
ALPHA=[A-Za-z\u0080-\u00ff]
IDENT={ALPHA}(_|{ALPHA}|{DIGIT})*
KEYWORD=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let|macro|method
|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|xor|yield
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
FLOAT32_SUFFIX=(f|F)32
FLOAT64_SUFFIX=(f|F)64
FLOAT32_LIT=({HEX_LIT}'{FLOAT32_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT32_SUFFIX})
FLOAT64_LIT=({HEX_LIT}'{FLOAT64_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT64_SUFFIX})
NUMERICAL_CONSTANT={HEX_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT}
|{INT_LIT}|{INT8_LIT}|{INT16_LIT}|{INT32_LIT}|{INT64_LIT}
|{UINT_LIT}|{UINT8_LIT}|{UINT16_LIT}|{UINT32_LIT}|{UINT64_LIT}
|{FLOAT_LIT}|{FLOAT32_LIT}|{FLOAT64_LIT}
BOOLEAN_CONSTANT=true|false
OPERATOR=[\=\+\-\*/<>@$~&%\|!\?\^\.:\\]+
BRACKET=[\{\}\[\]]|(\[\.)|(\.\])|(\{\.)|(\.\})|(\[:)
PARENTHESIS=[\(\)]|(\(\.)|(\.\))
SEMICOLON=;
COMMA=,
GRAVE_ACCENT=`
BUILT_IN_TYPES=AccessViolationError|AllocStats|any|ArithmeticError|array|AssertionError|AtomType|auto|BackwardsIndex
|BiggestFloat|BiggestInt|BiggestUInt|bool|byte|ByteAddress|CatchableError|cchar|cdouble|cfloat|char|cint|clong
|clongdouble|clonglong|cschar|cshort|csize|csize_t|cstring|cstringArray|cuchar|cuint|culong|culonglong|cushort
|DeadThreadError|Defect|DivByZeroError|Endianness|EOFError|Exception|ExecIOEffect|FieldError|FileSeekPos|float|float32
|float64|FloatDivByZeroError|FloatInexactError|FloatingPointError|FloatInvalidOpError|FloatOverflowError
|FloatUnderflowError|ForeignCell|ForLoopStmt|GC_Strategy|HSlice|IndexError|int|int16|int32|int64|int8|IOEffect|IOError
|JsRoot|KeyError|lent|LibraryError|Natural|NilAccessError|NimNode|ObjectAssignmentError|ObjectConversionError|openArray
|Ordinal|OSError|OutOfMemError|OverflowError|owned|PFloat32|PFloat64|PFrame|PInt32|PInt64|pointer|Positive|ptr|range
|RangeError|ReadIOEffect|ref|ReraiseError|ResourceExhaustedError|RootEffect|RootObj|RootRef|seq|set|sink|Slice
|SomeFloat|SomeInteger|SomeNumber|SomeOrdinal|SomeSignedInt|SomeUnsignedInt|StackOverflowError|StackTraceEntry|static
|string|TaintedString|TFrame|TimeEffect|type|typed|typedesc|TypeOfMode|uint|uint16|uint32|uint64|uint8|UncheckedArray
|untyped|ValueError|varargs|void|WriteIOEffect
BUILT_IN_PROCS=abs|add|addAndFetch|addEscapedChar|addFloat|addInt|addQuitProc|addQuoted|addr|alignof|alloc0Impl
|allocCStringArray|allocImpl|allocShared0Impl|allocSharedImpl|and|ashr|astToStr|atomicDec|atomicInc|card|cas|chr|clamp
|cmp|compileOption|compiles|contains|copyMem|cpuRelax|create|createShared|createSharedU|createU|cstringArrayToSeq
|deallocCStringArray|deallocHeap|deallocImpl|deallocShared|deallocSharedImpl|debugEcho|dec|declared|declaredInScope
|deepCopy|default|defined|del|delete|dispose|div|echo|equalMem|excl|find|finished|freeShared|GC_collectZct|GC_disable
|GC_disableMarkAndSweep|GC_enable|GC_enableMarkAndSweep|GC_fullCollect|GC_getStatistics|GC_ref|GC_unref|gcInvariant
|getAllocStats|getCurrentException|getCurrentExceptionMsg|getFrame|getFrameState|getFreeMem|getGcFrame|getMaxMem
|getOccupiedMem|getStackTrace|getStackTraceEntries|getTotalMem|getTypeInfo|gorge|gorgeEx|high|inc|incl|insert
|instantiationInfo|internalNew|is|isNil|isNotForeign|iterToProc|len|locals|low|max|min|mod|move|moveMem|new|newSeq
|newSeqOfCap|newSeqUninitialized|newString|newStringOfCap|nimGC_setStackBottom|not|of|or|ord|pop|popGcFrame|pred
|procCall|protect|pushGcFrame|quit|rawEnv|rawProc|realloc0Impl|reallocImpl|reallocShared0Impl|reallocSharedImpl|repr
|reset|resize|resizeShared|runnableExamples|setControlCHook|setCurrentException|setFrame|setFrameState|setGcFrame
|setLen|setupForeignThreadGc|shallow|shallowCopy|shl|shr|sizeof|slurp|stackTraceAvailable|staticExec|staticRead|substr
|succ|swap|tearDownForeignThreadGc|toBiggestFloat|toBiggestInt|toFloat|toInt|toOpenArray|toOpenArrayByte|toU16|toU32
|toU8|typeof|unsafeAddr|unsafeNew|unsetControlCHook|wasMoved|writeStackTrace|xor|ze|ze64|zeroMem

%{

private Stack<Integer> stack = new Stack<Integer>();

public void pushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
}

public void popState() {
    yybegin(stack.pop());
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
    {CRLF}+                     { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { pushState(LINE_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); return NimSyntaxTypes.COMMENT; }
    discard\ \"\"\"             { pushState(DISCARD_COMMENT); return NimSyntaxTypes.COMMENT; }
    {KEYWORD}                   { return NimSyntaxTypes.KEYWORD; }
    r\"                         { pushState(RAW_STRING_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    \"\"\"                      { pushState(TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    \"                          { pushState(STRING_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    {IDENT}\"                   { pushState(GENERALIZED_STRING_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    {IDENT}\"\"\"               { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    '                           { pushState(CHARACTER_LITERAL); return NimSyntaxTypes.STRING_LITERAL; }
    {NUMERICAL_CONSTANT}        { return NimSyntaxTypes.NUMERICAL_CONSTANT; }
    {BOOLEAN_CONSTANT}          { return NimSyntaxTypes.NUMERICAL_CONSTANT; }
    {OPERATOR}                  { return NimSyntaxTypes.OPERATOR; }
    {BRACKET}                   { return NimSyntaxTypes.BRACKET; }
    {PARENTHESIS}               { return NimSyntaxTypes.PARENTHESIS; }
    {SEMICOLON}                 { return NimSyntaxTypes.SEMICOLON; }
    {COMMA}                     { return NimSyntaxTypes.COMMA; }
    {GRAVE_ACCENT}              { return NimSyntaxTypes.GRAVE_ACCENT; }
    {BUILT_IN_TYPES}            { return NimSyntaxTypes.TYPES; }
    {BUILT_IN_PROCS}            { return NimSyntaxTypes.PROCS; }
    {IDENT}+                    { return NimSyntaxTypes.IDENT; }
    {ALPHA}+                    { return TokenType.WHITE_SPACE; }
    .                           { return TokenType.WHITE_SPACE; }
}

<LINE_COMMENT> {
    {CRLF}+                     { popState(); return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_COMMENT_END}         { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}+                     { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); return NimSyntaxTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_END}     { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}+                     { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<DISCARD_COMMENT> {
    \"\"\"                      { popState(); return NimSyntaxTypes.COMMENT; }
    {CRLF}                      { return NimSyntaxTypes.COMMENT; }
    .                           { return NimSyntaxTypes.COMMENT; }
}

<STRING_LITERAL> {
    \\\"                        { return NimSyntaxTypes.STRING_LITERAL; }
    \"                          { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return NimSyntaxTypes.STRING_LITERAL; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}

<RAW_STRING_LITERAL> {
    \"\"                        { return NimSyntaxTypes.STRING_LITERAL; }
    \"                          { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                        { return NimSyntaxTypes.STRING_LITERAL; }
    \"                          { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return NimSyntaxTypes.STRING_LITERAL; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}

<CHARACTER_LITERAL> {
    '                           { popState(); return NimSyntaxTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimSyntaxTypes.STRING_LITERAL; }
}
