// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimExprStmt extends NimElement {

  @Nullable
  NimColonBody getColonBody();

  @NotNull
  List<NimExpr> getExprList();

  @Nullable
  NimOptInd getOptInd();

  @Nullable
  NimPostExprBlocks getPostExprBlocks();

  @NotNull
  NimSimpleExpr getSimpleExpr();

}
