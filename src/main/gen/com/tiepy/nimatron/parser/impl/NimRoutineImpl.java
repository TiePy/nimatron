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

public class NimRoutineImpl extends ASTWrapperPsiElement implements NimRoutine {

  public NimRoutineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitRoutine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimGenericParams getGenericParams() {
    return findChildByClass(NimGenericParams.class);
  }

  @Override
  @NotNull
  public NimIdentVis getIdentVis() {
    return findNotNullChildByClass(NimIdentVis.class);
  }

  @Override
  @Nullable
  public NimOptInd getOptInd() {
    return findChildByClass(NimOptInd.class);
  }

  @Override
  @NotNull
  public NimParamsColon getParamsColon() {
    return findNotNullChildByClass(NimParamsColon.class);
  }

  @Override
  @Nullable
  public NimPattern getPattern() {
    return findChildByClass(NimPattern.class);
  }

  @Override
  @Nullable
  public NimPragma getPragma() {
    return findChildByClass(NimPragma.class);
  }

  @Override
  @Nullable
  public NimRem getRem() {
    return findChildByClass(NimRem.class);
  }

}
