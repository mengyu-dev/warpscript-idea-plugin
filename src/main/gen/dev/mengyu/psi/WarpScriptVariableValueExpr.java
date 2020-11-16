// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptVariableValueExpr extends PsiElement {

  @Nullable
  WarpScriptDoubleLiteralExpr getDoubleLiteralExpr();

  @Nullable
  WarpScriptLongLiteralExpr getLongLiteralExpr();

  @NotNull
  PsiElement getVarPrefix();

}
