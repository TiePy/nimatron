// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTryExpr extends NimElement {

  @NotNull
  NimColon getColon();

  @NotNull
  NimInlineStmt getInlineStmt();

  @NotNull
  List<NimOptInd> getOptIndList();

}
