// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimForStmt extends NimElement {

  @NotNull
  NimColcom getColcom();

  @NotNull
  List<NimComma> getCommaList();

  @NotNull
  NimExpr getExpr();

  @NotNull
  List<NimIdentWithPragma> getIdentWithPragmaList();

  @NotNull
  NimOptInd getOptInd();

}
