// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPar2 extends PsiElement {

  @NotNull
  List<NimComplexOrSimpleStmt> getComplexOrSimpleStmtList();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @Nullable
  NimSimpleExpr getSimpleExpr();

}
