// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectBranches extends NimElement {

  @NotNull
  List<NimColcom> getColcomList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimIndEq> getIndEqList();

  @NotNull
  List<NimObjectBranch> getObjectBranchList();

  @NotNull
  List<NimObjectPart> getObjectPartList();

}
