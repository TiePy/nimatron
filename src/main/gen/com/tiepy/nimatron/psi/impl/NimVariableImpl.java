// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tiepy.nimatron.psi.NimElementTypes.*;
import com.tiepy.nimatron.psi.*;

public class NimVariableImpl extends NimElementImpl implements NimVariable {

  public NimVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitVariable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimColonBody getColonBody() {
    return findChildByClass(NimColonBody.class);
  }

  @Override
  @Nullable
  public NimIdentColonEquals getIdentColonEquals() {
    return findChildByClass(NimIdentColonEquals.class);
  }

  @Override
  @NotNull
  public NimIndAndComment getIndAndComment() {
    return findNotNullChildByClass(NimIndAndComment.class);
  }

  @Override
  @Nullable
  public NimVarTuple getVarTuple() {
    return findChildByClass(NimVarTuple.class);
  }

}
