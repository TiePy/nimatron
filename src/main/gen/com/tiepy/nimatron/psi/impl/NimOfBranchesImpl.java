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

public class NimOfBranchesImpl extends NimElementImpl implements NimOfBranches {

  public NimOfBranchesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitOfBranches(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NimOfBranch> getOfBranchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOfBranch.class);
  }

  @Override
  @NotNull
  public List<NimOfBranches1> getOfBranches1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NimOfBranches1.class);
  }

  @Override
  @Nullable
  public NimOfBranches2 getOfBranches2() {
    return findChildByClass(NimOfBranches2.class);
  }

}
