// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface WarpScriptCollectionValueExpr extends PsiElement {

  @Nullable
  WarpScriptListExpr getListExpr();

  @Nullable
  WarpScriptMapExpr getMapExpr();

  @Nullable
  WarpScriptSetExpr getSetExpr();

}
