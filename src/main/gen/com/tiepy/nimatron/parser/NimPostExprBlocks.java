// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPostExprBlocks extends PsiElement {

  @NotNull
  List<NimDoBlock> getDoBlockList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimExprList> getExprListList();

  @NotNull
  List<NimStmt> getStmtList();

}
