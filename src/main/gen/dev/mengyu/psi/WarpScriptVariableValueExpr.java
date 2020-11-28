// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface WarpScriptVariableValueExpr extends PsiElement {

  @Nullable
  WarpScriptDoubleLiteralExpr getDoubleLiteralExpr();

  @Nullable
  WarpScriptLongLiteralExpr getLongLiteralExpr();

  @NotNull
  PsiElement getVarPrefix();

}
