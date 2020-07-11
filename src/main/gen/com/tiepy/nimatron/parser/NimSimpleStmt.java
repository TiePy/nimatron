// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSimpleStmt extends PsiElement {

  @Nullable
  NimBreakStmt getBreakStmt();

  @Nullable
  NimContinueStmt getContinueStmt();

  @Nullable
  NimDiscardStmt getDiscardStmt();

  @Nullable
  NimExportStmt getExportStmt();

  @Nullable
  NimExprStmt getExprStmt();

  @Nullable
  NimFromStmt getFromStmt();

  @Nullable
  NimImportStmt getImportStmt();

  @Nullable
  NimIncludeStmt getIncludeStmt();

  @Nullable
  NimPragmaStmt getPragmaStmt();

  @Nullable
  NimRaiseStmt getRaiseStmt();

  @Nullable
  NimReturnStmt getReturnStmt();

  @Nullable
  NimYieldStmt getYieldStmt();

}
