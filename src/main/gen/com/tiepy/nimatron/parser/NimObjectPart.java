// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectPart extends PsiElement {

  @Nullable
  NimDeclColonEquals getDeclColonEquals();

  @Nullable
  NimObjectCase getObjectCase();

  @NotNull
  List<NimObjectPart> getObjectPartList();

  @Nullable
  NimObjectWhen getObjectWhen();

}
