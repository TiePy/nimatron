// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimComplexOrSimpleStmt extends PsiElement {

  @Nullable
  NimAsmStmt getAsmStmt();

  @Nullable
  NimBindStmt getBindStmt();

  @Nullable
  NimBlockStmt getBlockStmt();

  @NotNull
  List<NimConstant> getConstantList();

  @Nullable
  NimDeferStmt getDeferStmt();

  @Nullable
  NimForStmt getForStmt();

  @Nullable
  NimIfStmt getIfStmt();

  @Nullable
  NimMixinStmt getMixinStmt();

  @Nullable
  NimRoutine getRoutine();

  @Nullable
  NimSimpleStmt getSimpleStmt();

  @Nullable
  NimStaticStmt getStaticStmt();

  @Nullable
  NimTryStmt getTryStmt();

  @NotNull
  List<NimTypeDef> getTypeDefList();

  @NotNull
  List<NimVariable> getVariableList();

  @Nullable
  NimWhenStmt getWhenStmt();

  @Nullable
  NimWhileStmt getWhileStmt();

}
