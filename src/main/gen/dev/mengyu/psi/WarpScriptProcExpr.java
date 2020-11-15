// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptProcExpr extends PsiElement {

  @NotNull
  List<WarpScriptFuncCallExpr> getFuncCallExprList();

  @NotNull
  List<WarpScriptRawTypeExpr> getRawTypeExprList();

}
