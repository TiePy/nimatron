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

public class NimExprStmtImpl extends ASTWrapperPsiElement implements NimExprStmt {

  public NimExprStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NimVisitor visitor) {
    visitor.visitExprStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NimVisitor) accept((NimVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NimExprStmt1 getExprStmt1() {
    return findChildByClass(NimExprStmt1.class);
  }

  @Override
  @Nullable
  public NimExprStmt2 getExprStmt2() {
    return findChildByClass(NimExprStmt2.class);
  }

  @Override
  @NotNull
  public NimSimpleExpr getSimpleExpr() {
    return findNotNullChildByClass(NimSimpleExpr.class);
  }

}
