// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimConstant extends NimElement {

  @Nullable
  NimColon getColon();

  @Nullable
  NimIdentWithPragma getIdentWithPragma();

  @NotNull
  NimIndAndComment getIndAndComment();

  @NotNull
  NimOptInd getOptInd();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimVarTuple getVarTuple();

}
