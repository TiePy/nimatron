package com.tiepy.nimatron;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import com.tiepy.nimatron.psi.NimTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NimSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey(
            "NIM_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey(
            "NIM_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING_LITERAL = createTextAttributesKey(
            "NIM_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMERICAL_CONSTANT = createTextAttributesKey(
            "NIM_NUMERICAL_CONSTANT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey(
            "NIM_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BRACKET = createTextAttributesKey(
            "NIM_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PARENTHESIS = createTextAttributesKey(
            "NIM_PARENTHESIS", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey(
            "NIM_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COMMA = createTextAttributesKey(
            "NIM_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey TYPES = createTextAttributesKey(
            "NIM_TYPES", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PROCS = createTextAttributesKey(
            "NIM_PROCS", DefaultLanguageHighlighterColors.KEYWORD);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] LITERAL_STRING_KEYS = new TextAttributesKey[]{STRING_LITERAL};
    private static final TextAttributesKey[] NUMERICAL_CONSTANT_KEYS = new TextAttributesKey[]{NUMERICAL_CONSTANT};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKET};
    private static final TextAttributesKey[] PARENTHESIS_KEYS = new TextAttributesKey[]{PARENTHESIS};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] TYPES_KEYS = new TextAttributesKey[]{TYPES};
    private static final TextAttributesKey[] PROCS_KEYS = new TextAttributesKey[]{PROCS};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NimLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NimTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(NimTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(NimTypes.STRING_LITERAL)) {
            return LITERAL_STRING_KEYS;
        } else if (tokenType.equals(NimTypes.NUMERICAL_CONSTANT)) {
            return NUMERICAL_CONSTANT_KEYS;
        } else if (tokenType.equals(NimTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        } else if (tokenType.equals(NimTypes.BRACKET)) {
            return BRACKET_KEYS;
        } else if (tokenType.equals(NimTypes.PARENTHESIS)) {
            return PARENTHESIS_KEYS;
        } else if (tokenType.equals(NimTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(NimTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(NimTypes.TYPES)) {
            return TYPES_KEYS;
        } else if (tokenType.equals(NimTypes.PROCS)) {
            return PROCS_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
