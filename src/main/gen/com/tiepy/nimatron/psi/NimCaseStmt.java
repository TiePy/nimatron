// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimCaseStmt extends NimElement {

  @Nullable
  NimDedent getDedent();

  @NotNull
  NimExpr getExpr();

  @Nullable
  NimIndEq getIndEq();

  @NotNull
  NimOfBranches getOfBranches();

}
