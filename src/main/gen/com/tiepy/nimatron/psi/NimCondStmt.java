// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimCondStmt extends NimElement {

  @NotNull
  List<NimCondStmt1> getCondStmt1List();

  @Nullable
  NimCondStmt2 getCondStmt2();

  @NotNull
  NimExpr getExpr();

  @Nullable
  NimOptInd getOptInd();

}
