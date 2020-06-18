// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tiepy.nimatron.parser.NimTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tiepy.nimatron.parser.*;

public class NimParamListArrowImpl extends ASTWrapperPsiElement implements NimParamListArrow {

  public NimParamListArrowImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitParamListArrow(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimOptInd getOptInd() {
    return findChildByClass(NimOptInd.class);
  }

  @Override
  @Nullable
  public NimParamList getParamList() {
    return findChildByClass(NimParamList.class);
  }

  @Override
  @Nullable
  public NimTypeDesc getTypeDesc() {
    return findChildByClass(NimTypeDesc.class);
  }

}
