// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimEnum extends PsiElement {

  @NotNull
  List<NimComma> getCommaList();

  @NotNull
  List<NimExpr> getExprList();

  @NotNull
  List<NimOptInd> getOptIndList();

  @NotNull
  List<NimPragma> getPragmaList();

  @NotNull
  List<NimSymbol> getSymbolList();

}
