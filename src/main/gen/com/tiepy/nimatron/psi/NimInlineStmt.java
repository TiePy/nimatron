// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimInlineStmt extends NimElement {

  @NotNull
  List<NimComplexOrSimpleStmt> getComplexOrSimpleStmtList();

  @Nullable
  NimDedent getDedent();

  @NotNull
  List<NimIndEq> getIndEqList();

  @NotNull
  List<NimSimpleStmt> getSimpleStmtList();

}
