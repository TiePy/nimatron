// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectPart extends NimElement {

  @Nullable
  NimDeclColonEquals getDeclColonEquals();

  @Nullable
  NimDedent getDedent();

  @NotNull
  List<NimIndEq> getIndEqList();

  @Nullable
  NimObjectCase getObjectCase();

  @NotNull
  List<NimObjectPart> getObjectPartList();

  @Nullable
  NimObjectWhen getObjectWhen();

}
