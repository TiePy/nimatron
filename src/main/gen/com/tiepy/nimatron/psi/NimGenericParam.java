// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimGenericParam extends NimElement {

  @Nullable
  NimColon getColon();

  @NotNull
  List<NimComma> getCommaList();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimOptInd getOptInd();

  @NotNull
  List<NimSymbol> getSymbolList();

}
