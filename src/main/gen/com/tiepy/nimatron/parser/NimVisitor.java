// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class NimVisitor extends PsiElementVisitor {

  public void visitExpr(@NotNull NimExpr o) {
    visitPsiElement(o);
  }

  public void visitExprList(@NotNull NimExprList o) {
    visitPsiElement(o);
  }

  public void visitExprStmt(@NotNull NimExprStmt o) {
    visitPsiElement(o);
  }

  public void visitIfStmt(@NotNull NimIfStmt o) {
    visitPsiElement(o);
  }

  public void visitLiteral(@NotNull NimLiteral o) {
    visitPsiElement(o);
  }

  public void visitPrefixOperator(@NotNull NimPrefixOperator o) {
    visitPsiElement(o);
  }

  public void visitStmt(@NotNull NimStmt o) {
    visitPsiElement(o);
  }

  public void visitVarStmt(@NotNull NimVarStmt o) {
    visitPsiElement(o);
  }

  public void visitVariable(@NotNull NimVariable o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
