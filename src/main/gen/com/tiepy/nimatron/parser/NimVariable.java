// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimVariable extends PsiElement {

  @Nullable
  NimColonBody getColonBody();

  @Nullable
  NimIdentColonEquals getIdentColonEquals();

  @Nullable
  NimVarTuple getVarTuple();

}
