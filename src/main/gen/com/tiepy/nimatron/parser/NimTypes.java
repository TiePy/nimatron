// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.NimElementType;
import com.tiepy.nimatron.psi.NimTokenType;
import com.tiepy.nimatron.parser.impl.*;

public interface NimTypes {

  IElementType ARRAY_CONSTR = new NimElementType("ARRAY_CONSTR");
  IElementType ASM_STMT = new NimElementType("ASM_STMT");
  IElementType BIND_STMT = new NimElementType("BIND_STMT");
  IElementType BLOCK_STMT = new NimElementType("BLOCK_STMT");
  IElementType BREAK_STMT = new NimElementType("BREAK_STMT");
  IElementType CASE_STMT = new NimElementType("CASE_STMT");
  IElementType CASE_STMT_1 = new NimElementType("CASE_STMT_1");
  IElementType CASE_STMT_2 = new NimElementType("CASE_STMT_2");
  IElementType CAST_EXPR = new NimElementType("CAST_EXPR");
  IElementType COLON_BODY = new NimElementType("COLON_BODY");
  IElementType COND_EXPR = new NimElementType("COND_EXPR");
  IElementType COND_STMT = new NimElementType("COND_STMT");
  IElementType CONSTANT = new NimElementType("CONSTANT");
  IElementType CONST_STMT = new NimElementType("CONST_STMT");
  IElementType CONTINUE_STMT = new NimElementType("CONTINUE_STMT");
  IElementType CONVERTER_STMT = new NimElementType("CONVERTER_STMT");
  IElementType DECL_COLON_EQUALS = new NimElementType("DECL_COLON_EQUALS");
  IElementType DEFER_STMT = new NimElementType("DEFER_STMT");
  IElementType DISCARD_STMT = new NimElementType("DISCARD_STMT");
  IElementType DO_BLOCK = new NimElementType("DO_BLOCK");
  IElementType EXPORT_STMT = new NimElementType("EXPORT_STMT");
  IElementType EXPORT_STMT_1 = new NimElementType("EXPORT_STMT_1");
  IElementType EXPR = new NimElementType("EXPR");
  IElementType EXPRS = new NimElementType("EXPRS");
  IElementType EXPR_COLON_EQ_EXPR = new NimElementType("EXPR_COLON_EQ_EXPR");
  IElementType EXPR_COLON_EQ_EXPRS = new NimElementType("EXPR_COLON_EQ_EXPRS");
  IElementType EXPR_STMT = new NimElementType("EXPR_STMT");
  IElementType EXPR_STMT_1 = new NimElementType("EXPR_STMT_1");
  IElementType EXPR_STMT_2 = new NimElementType("EXPR_STMT_2");
  IElementType FOR_STMT = new NimElementType("FOR_STMT");
  IElementType FROM_STMT = new NimElementType("FROM_STMT");
  IElementType FUNC_STMT = new NimElementType("FUNC_STMT");
  IElementType GENERALIZED_LIT = new NimElementType("GENERALIZED_LIT");
  IElementType GENERIC_PARAM = new NimElementType("GENERIC_PARAM");
  IElementType GENERIC_PARAMS = new NimElementType("GENERIC_PARAMS");
  IElementType IDENT_COLON_EQUALS = new NimElementType("IDENT_COLON_EQUALS");
  IElementType IDENT_OR_LITERAL = new NimElementType("IDENT_OR_LITERAL");
  IElementType IDENT_VIS = new NimElementType("IDENT_VIS");
  IElementType IDENT_VIS_DOT = new NimElementType("IDENT_VIS_DOT");
  IElementType IDENT_WITH_PRAGMA = new NimElementType("IDENT_WITH_PRAGMA");
  IElementType IDENT_WITH_PRAGMA_DOT = new NimElementType("IDENT_WITH_PRAGMA_DOT");
  IElementType IF_EXPR = new NimElementType("IF_EXPR");
  IElementType IF_STMT = new NimElementType("IF_STMT");
  IElementType IMPORT_STMT = new NimElementType("IMPORT_STMT");
  IElementType IMPORT_STMT_1 = new NimElementType("IMPORT_STMT_1");
  IElementType INCLUDE_STMT = new NimElementType("INCLUDE_STMT");
  IElementType ITERATOR_STMT = new NimElementType("ITERATOR_STMT");
  IElementType LITERAL = new NimElementType("LITERAL");
  IElementType MACRO_STMT = new NimElementType("MACRO_STMT");
  IElementType METHOD_STMT = new NimElementType("METHOD_STMT");
  IElementType MIXIN_STMT = new NimElementType("MIXIN_STMT");
  IElementType OF_BRANCH = new NimElementType("OF_BRANCH");
  IElementType OF_BRANCHES = new NimElementType("OF_BRANCHES");
  IElementType OP = new NimElementType("OP");
  IElementType OPERATOR = new NimElementType("OPERATOR");
  IElementType OPT_IND = new NimElementType("OPT_IND");
  IElementType PAR = new NimElementType("PAR");
  IElementType PARAMS = new NimElementType("PARAMS");
  IElementType PARAMS_ARROW = new NimElementType("PARAMS_ARROW");
  IElementType PARAMS_COLON = new NimElementType("PARAMS_COLON");
  IElementType PAR_1 = new NimElementType("PAR_1");
  IElementType PAR_2 = new NimElementType("PAR_2");
  IElementType PAR_3 = new NimElementType("PAR_3");
  IElementType PAR_4 = new NimElementType("PAR_4");
  IElementType PAR_5 = new NimElementType("PAR_5");
  IElementType PAR_6 = new NimElementType("PAR_6");
  IElementType PATTERN = new NimElementType("PATTERN");
  IElementType POST_EXPR_BLOCKS = new NimElementType("POST_EXPR_BLOCKS");
  IElementType POST_EXPR_BLOCKS_1 = new NimElementType("POST_EXPR_BLOCKS_1");
  IElementType POST_EXPR_BLOCKS_2 = new NimElementType("POST_EXPR_BLOCKS_2");
  IElementType POST_EXPR_BLOCKS_3 = new NimElementType("POST_EXPR_BLOCKS_3");
  IElementType POST_EXPR_BLOCKS_4 = new NimElementType("POST_EXPR_BLOCKS_4");
  IElementType POST_EXPR_BLOCKS_5 = new NimElementType("POST_EXPR_BLOCKS_5");
  IElementType PRAGMA = new NimElementType("PRAGMA");
  IElementType PRAGMA_STMT = new NimElementType("PRAGMA_STMT");
  IElementType PRIMARY = new NimElementType("PRIMARY");
  IElementType PRIMARY_1 = new NimElementType("PRIMARY_1");
  IElementType PRIMARY_2 = new NimElementType("PRIMARY_2");
  IElementType PRIMARY_3 = new NimElementType("PRIMARY_3");
  IElementType PRIMARY_SUFFIX = new NimElementType("PRIMARY_SUFFIX");
  IElementType PRIMARY_SUFFIX_1 = new NimElementType("PRIMARY_SUFFIX_1");
  IElementType PRIMARY_SUFFIX_2 = new NimElementType("PRIMARY_SUFFIX_2");
  IElementType PRIMARY_SUFFIX_3 = new NimElementType("PRIMARY_SUFFIX_3");
  IElementType PRIMARY_SUFFIX_4 = new NimElementType("PRIMARY_SUFFIX_4");
  IElementType PRIMARY_SUFFIX_5 = new NimElementType("PRIMARY_SUFFIX_5");
  IElementType PROC_STMT = new NimElementType("PROC_STMT");
  IElementType QUALIFIED_IDENT = new NimElementType("QUALIFIED_IDENT");
  IElementType RAISE_STMT = new NimElementType("RAISE_STMT");
  IElementType RETURN_STMT = new NimElementType("RETURN_STMT");
  IElementType ROUTINE = new NimElementType("ROUTINE");
  IElementType SECTION = new NimElementType("SECTION");
  IElementType SET_OR_TABLE_CONSTR = new NimElementType("SET_OR_TABLE_CONSTR");
  IElementType SIMPLE_EXPR = new NimElementType("SIMPLE_EXPR");
  IElementType STATIC_STMT = new NimElementType("STATIC_STMT");
  IElementType STMT = new NimElementType("STMT");
  IElementType STMTS = new NimElementType("STMTS");
  IElementType SYMBOL = new NimElementType("SYMBOL");
  IElementType TEMPLATE_STMT = new NimElementType("TEMPLATE_STMT");
  IElementType TERM_IND = new NimElementType("TERM_IND");
  IElementType TRY_EXPR = new NimElementType("TRY_EXPR");
  IElementType TRY_STMT = new NimElementType("TRY_STMT");
  IElementType TYPE_CLASS = new NimElementType("TYPE_CLASS");
  IElementType TYPE_CLASS_PARAM = new NimElementType("TYPE_CLASS_PARAM");
  IElementType TYPE_DEF = new NimElementType("TYPE_DEF");
  IElementType TYPE_DEF_AUX = new NimElementType("TYPE_DEF_AUX");
  IElementType TYPE_DESC = new NimElementType("TYPE_DESC");
  IElementType TYPE_KEYW = new NimElementType("TYPE_KEYW");
  IElementType TYPE_STMT = new NimElementType("TYPE_STMT");
  IElementType VARIABLE = new NimElementType("VARIABLE");
  IElementType VAR_STMT = new NimElementType("VAR_STMT");
  IElementType VAR_TUPLE = new NimElementType("VAR_TUPLE");
  IElementType WHEN_EXPR = new NimElementType("WHEN_EXPR");
  IElementType WHEN_STMT = new NimElementType("WHEN_STMT");
  IElementType WHILE_STMT = new NimElementType("WHILE_STMT");
  IElementType YIELD_STMT = new NimElementType("YIELD_STMT");

  IElementType BOOL_LIT = new NimTokenType("BOOL_LIT");
  IElementType BRACKET = new NimTokenType("BRACKET");
  IElementType CHAR_LIT = new NimTokenType("CHAR_LIT");
  IElementType COMMA = new NimTokenType("COMMA");
  IElementType DEDENT = new NimTokenType("DEDENT");
  IElementType FLOAT32_LIT = new NimTokenType("FLOAT32_LIT");
  IElementType FLOAT64_LIT = new NimTokenType("FLOAT64_LIT");
  IElementType FLOAT_LIT = new NimTokenType("FLOAT_LIT");
  IElementType GENERALIZED_STR_LIT = new NimTokenType("GENERALIZED_STR_LIT");
  IElementType GENERALIZED_TRIPLESTR_LIT = new NimTokenType("GENERALIZED_TRIPLESTR_LIT");
  IElementType GRAVE_ACCENT = new NimTokenType("GRAVE_ACCENT");
  IElementType IDENT = new NimTokenType("IDENT");
  IElementType INDENT = new NimTokenType("INDENT");
  IElementType IND_EQ = new NimTokenType("IND_EQ");
  IElementType INT16_LIT = new NimTokenType("INT16_LIT");
  IElementType INT32_LIT = new NimTokenType("INT32_LIT");
  IElementType INT64_LIT = new NimTokenType("INT64_LIT");
  IElementType INT8_LIT = new NimTokenType("INT8_LIT");
  IElementType INT_LIT = new NimTokenType("INT_LIT");
  IElementType KEYW = new NimTokenType("KEYW");
  IElementType NIL = new NimTokenType("NIL");
  IElementType OP0 = new NimTokenType("OP0");
  IElementType OP1 = new NimTokenType("OP1");
  IElementType OP10 = new NimTokenType("OP10");
  IElementType OP2 = new NimTokenType("OP2");
  IElementType OP3 = new NimTokenType("OP3");
  IElementType OP4 = new NimTokenType("OP4");
  IElementType OP5 = new NimTokenType("OP5");
  IElementType OP6 = new NimTokenType("OP6");
  IElementType OP7 = new NimTokenType("OP7");
  IElementType OP8 = new NimTokenType("OP8");
  IElementType OP9 = new NimTokenType("OP9");
  IElementType OPR = new NimTokenType("OPR");
  IElementType RSTR_LIT = new NimTokenType("RSTR_LIT");
  IElementType SEMICOLON = new NimTokenType("SEMICOLON");
  IElementType STR_LIT = new NimTokenType("STR_LIT");
  IElementType TRIPLESTR_LIT = new NimTokenType("TRIPLESTR_LIT");
  IElementType UINT16_LIT = new NimTokenType("UINT16_LIT");
  IElementType UINT32_LIT = new NimTokenType("UINT32_LIT");
  IElementType UINT64_LIT = new NimTokenType("UINT64_LIT");
  IElementType UINT8_LIT = new NimTokenType("UINT8_LIT");
  IElementType UINT_LIT = new NimTokenType("UINT_LIT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_CONSTR) {
        return new NimArrayConstrImpl(node);
      }
      else if (type == ASM_STMT) {
        return new NimAsmStmtImpl(node);
      }
      else if (type == BIND_STMT) {
        return new NimBindStmtImpl(node);
      }
      else if (type == BLOCK_STMT) {
        return new NimBlockStmtImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new NimBreakStmtImpl(node);
      }
      else if (type == CASE_STMT) {
        return new NimCaseStmtImpl(node);
      }
      else if (type == CASE_STMT_1) {
        return new NimCaseStmt1Impl(node);
      }
      else if (type == CASE_STMT_2) {
        return new NimCaseStmt2Impl(node);
      }
      else if (type == CAST_EXPR) {
        return new NimCastExprImpl(node);
      }
      else if (type == COLON_BODY) {
        return new NimColonBodyImpl(node);
      }
      else if (type == COND_EXPR) {
        return new NimCondExprImpl(node);
      }
      else if (type == COND_STMT) {
        return new NimCondStmtImpl(node);
      }
      else if (type == CONSTANT) {
        return new NimConstantImpl(node);
      }
      else if (type == CONST_STMT) {
        return new NimConstStmtImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new NimContinueStmtImpl(node);
      }
      else if (type == CONVERTER_STMT) {
        return new NimConverterStmtImpl(node);
      }
      else if (type == DECL_COLON_EQUALS) {
        return new NimDeclColonEqualsImpl(node);
      }
      else if (type == DEFER_STMT) {
        return new NimDeferStmtImpl(node);
      }
      else if (type == DISCARD_STMT) {
        return new NimDiscardStmtImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new NimDoBlockImpl(node);
      }
      else if (type == EXPORT_STMT) {
        return new NimExportStmtImpl(node);
      }
      else if (type == EXPORT_STMT_1) {
        return new NimExportStmt1Impl(node);
      }
      else if (type == EXPR) {
        return new NimExprImpl(node);
      }
      else if (type == EXPRS) {
        return new NimExprsImpl(node);
      }
      else if (type == EXPR_COLON_EQ_EXPR) {
        return new NimExprColonEqExprImpl(node);
      }
      else if (type == EXPR_COLON_EQ_EXPRS) {
        return new NimExprColonEqExprsImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new NimExprStmtImpl(node);
      }
      else if (type == EXPR_STMT_1) {
        return new NimExprStmt1Impl(node);
      }
      else if (type == EXPR_STMT_2) {
        return new NimExprStmt2Impl(node);
      }
      else if (type == FOR_STMT) {
        return new NimForStmtImpl(node);
      }
      else if (type == FROM_STMT) {
        return new NimFromStmtImpl(node);
      }
      else if (type == FUNC_STMT) {
        return new NimFuncStmtImpl(node);
      }
      else if (type == GENERALIZED_LIT) {
        return new NimGeneralizedLitImpl(node);
      }
      else if (type == GENERIC_PARAM) {
        return new NimGenericParamImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new NimGenericParamsImpl(node);
      }
      else if (type == IDENT_COLON_EQUALS) {
        return new NimIdentColonEqualsImpl(node);
      }
      else if (type == IDENT_OR_LITERAL) {
        return new NimIdentOrLiteralImpl(node);
      }
      else if (type == IDENT_VIS) {
        return new NimIdentVisImpl(node);
      }
      else if (type == IDENT_VIS_DOT) {
        return new NimIdentVisDotImpl(node);
      }
      else if (type == IDENT_WITH_PRAGMA) {
        return new NimIdentWithPragmaImpl(node);
      }
      else if (type == IDENT_WITH_PRAGMA_DOT) {
        return new NimIdentWithPragmaDotImpl(node);
      }
      else if (type == IF_EXPR) {
        return new NimIfExprImpl(node);
      }
      else if (type == IF_STMT) {
        return new NimIfStmtImpl(node);
      }
      else if (type == IMPORT_STMT) {
        return new NimImportStmtImpl(node);
      }
      else if (type == IMPORT_STMT_1) {
        return new NimImportStmt1Impl(node);
      }
      else if (type == INCLUDE_STMT) {
        return new NimIncludeStmtImpl(node);
      }
      else if (type == ITERATOR_STMT) {
        return new NimIteratorStmtImpl(node);
      }
      else if (type == LITERAL) {
        return new NimLiteralImpl(node);
      }
      else if (type == MACRO_STMT) {
        return new NimMacroStmtImpl(node);
      }
      else if (type == METHOD_STMT) {
        return new NimMethodStmtImpl(node);
      }
      else if (type == MIXIN_STMT) {
        return new NimMixinStmtImpl(node);
      }
      else if (type == OF_BRANCH) {
        return new NimOfBranchImpl(node);
      }
      else if (type == OF_BRANCHES) {
        return new NimOfBranchesImpl(node);
      }
      else if (type == OP) {
        return new NimOpImpl(node);
      }
      else if (type == OPERATOR) {
        return new NimOperatorImpl(node);
      }
      else if (type == OPT_IND) {
        return new NimOptIndImpl(node);
      }
      else if (type == PAR) {
        return new NimParImpl(node);
      }
      else if (type == PARAMS) {
        return new NimParamsImpl(node);
      }
      else if (type == PARAMS_ARROW) {
        return new NimParamsArrowImpl(node);
      }
      else if (type == PARAMS_COLON) {
        return new NimParamsColonImpl(node);
      }
      else if (type == PAR_1) {
        return new NimPar1Impl(node);
      }
      else if (type == PAR_2) {
        return new NimPar2Impl(node);
      }
      else if (type == PAR_3) {
        return new NimPar3Impl(node);
      }
      else if (type == PAR_4) {
        return new NimPar4Impl(node);
      }
      else if (type == PAR_5) {
        return new NimPar5Impl(node);
      }
      else if (type == PAR_6) {
        return new NimPar6Impl(node);
      }
      else if (type == PATTERN) {
        return new NimPatternImpl(node);
      }
      else if (type == POST_EXPR_BLOCKS) {
        return new NimPostExprBlocksImpl(node);
      }
      else if (type == POST_EXPR_BLOCKS_1) {
        return new NimPostExprBlocks1Impl(node);
      }
      else if (type == POST_EXPR_BLOCKS_2) {
        return new NimPostExprBlocks2Impl(node);
      }
      else if (type == POST_EXPR_BLOCKS_3) {
        return new NimPostExprBlocks3Impl(node);
      }
      else if (type == POST_EXPR_BLOCKS_4) {
        return new NimPostExprBlocks4Impl(node);
      }
      else if (type == POST_EXPR_BLOCKS_5) {
        return new NimPostExprBlocks5Impl(node);
      }
      else if (type == PRAGMA) {
        return new NimPragmaImpl(node);
      }
      else if (type == PRAGMA_STMT) {
        return new NimPragmaStmtImpl(node);
      }
      else if (type == PRIMARY) {
        return new NimPrimaryImpl(node);
      }
      else if (type == PRIMARY_1) {
        return new NimPrimary1Impl(node);
      }
      else if (type == PRIMARY_2) {
        return new NimPrimary2Impl(node);
      }
      else if (type == PRIMARY_3) {
        return new NimPrimary3Impl(node);
      }
      else if (type == PRIMARY_SUFFIX) {
        return new NimPrimarySuffixImpl(node);
      }
      else if (type == PRIMARY_SUFFIX_1) {
        return new NimPrimarySuffix1Impl(node);
      }
      else if (type == PRIMARY_SUFFIX_2) {
        return new NimPrimarySuffix2Impl(node);
      }
      else if (type == PRIMARY_SUFFIX_3) {
        return new NimPrimarySuffix3Impl(node);
      }
      else if (type == PRIMARY_SUFFIX_4) {
        return new NimPrimarySuffix4Impl(node);
      }
      else if (type == PRIMARY_SUFFIX_5) {
        return new NimPrimarySuffix5Impl(node);
      }
      else if (type == PROC_STMT) {
        return new NimProcStmtImpl(node);
      }
      else if (type == QUALIFIED_IDENT) {
        return new NimQualifiedIdentImpl(node);
      }
      else if (type == RAISE_STMT) {
        return new NimRaiseStmtImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new NimReturnStmtImpl(node);
      }
      else if (type == ROUTINE) {
        return new NimRoutineImpl(node);
      }
      else if (type == SECTION) {
        return new NimSectionImpl(node);
      }
      else if (type == SET_OR_TABLE_CONSTR) {
        return new NimSetOrTableConstrImpl(node);
      }
      else if (type == SIMPLE_EXPR) {
        return new NimSimpleExprImpl(node);
      }
      else if (type == STATIC_STMT) {
        return new NimStaticStmtImpl(node);
      }
      else if (type == STMT) {
        return new NimStmtImpl(node);
      }
      else if (type == STMTS) {
        return new NimStmtsImpl(node);
      }
      else if (type == SYMBOL) {
        return new NimSymbolImpl(node);
      }
      else if (type == TEMPLATE_STMT) {
        return new NimTemplateStmtImpl(node);
      }
      else if (type == TERM_IND) {
        return new NimTermIndImpl(node);
      }
      else if (type == TRY_EXPR) {
        return new NimTryExprImpl(node);
      }
      else if (type == TRY_STMT) {
        return new NimTryStmtImpl(node);
      }
      else if (type == TYPE_CLASS) {
        return new NimTypeClassImpl(node);
      }
      else if (type == TYPE_CLASS_PARAM) {
        return new NimTypeClassParamImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new NimTypeDefImpl(node);
      }
      else if (type == TYPE_DEF_AUX) {
        return new NimTypeDefAuxImpl(node);
      }
      else if (type == TYPE_DESC) {
        return new NimTypeDescImpl(node);
      }
      else if (type == TYPE_KEYW) {
        return new NimTypeKeywImpl(node);
      }
      else if (type == TYPE_STMT) {
        return new NimTypeStmtImpl(node);
      }
      else if (type == VARIABLE) {
        return new NimVariableImpl(node);
      }
      else if (type == VAR_STMT) {
        return new NimVarStmtImpl(node);
      }
      else if (type == VAR_TUPLE) {
        return new NimVarTupleImpl(node);
      }
      else if (type == WHEN_EXPR) {
        return new NimWhenExprImpl(node);
      }
      else if (type == WHEN_STMT) {
        return new NimWhenStmtImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new NimWhileStmtImpl(node);
      }
      else if (type == YIELD_STMT) {
        return new NimYieldStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
