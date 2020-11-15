// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptLiteralExpr extends PsiElement {

  @Nullable
  WarpScriptBoolLiteralExpr getBoolLiteralExpr();

  @Nullable
  WarpScriptStringLiteralExpr getStringLiteralExpr();

  @Nullable
  PsiElement getDouble();

  @Nullable
  PsiElement getInt();

}
