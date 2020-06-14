package com.tiepy.nimatron;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.tiepy.nimatron.psi.NimTypes;

%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\n|\r|\r\n
WHITE_SPACE=[\ \t\f]
BLOCK_COMMENT=#\[
BLOCK_DOC_COMMENT=##\[
KEYWORD="echo"

%{
  int level = 0; // Level counter for nested blocks.
%}

%state YYINITIAL
%state LINE_COMMENT
%state BLOCK_COMMENT
%state BLOCK_DOC_COMMENT
%state LITERAL_STRING

%%

<YYINITIAL> {
    {CRLF}+                     { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { yybegin(LINE_COMMENT); }
    {BLOCK_COMMENT}             { level = 1; yybegin(BLOCK_COMMENT); }
    {BLOCK_DOC_COMMENT}         { level = 1; yybegin(BLOCK_DOC_COMMENT); }
    {KEYWORD}                   { return NimTypes.KEYWORD; }
    \"                          { yybegin(LITERAL_STRING); }
    .                           { return NimTypes.IGNORED; }
}

<LINE_COMMENT> {
    {CRLF}+                     { yybegin(YYINITIAL); return NimTypes.COMMENT; }
    .                           { }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT}             { level++; yybegin(BLOCK_COMMENT); }
    \]#                         { if (--level == 0) { yybegin(YYINITIAL); return NimTypes.COMMENT; } }
    {CRLF}+                     { }
    .                           { }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT}         { level++; yybegin(BLOCK_DOC_COMMENT); }
    \]##                        { if (--level == 0) { yybegin(YYINITIAL); return NimTypes.COMMENT; } }
    {CRLF}+                     { }
    .                           { }
}

<LITERAL_STRING> {
    \\\"                        { }
    \"                          { yybegin(YYINITIAL); return NimTypes.LITERAL_STRING; }
    .                           { }
}
