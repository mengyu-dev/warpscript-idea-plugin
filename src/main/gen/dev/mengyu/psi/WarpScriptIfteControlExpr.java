// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface WarpScriptIfteControlExpr extends PsiElement {

  @NotNull
  List<WarpScriptMacroCallExpr> getMacroCallExprList();

  @NotNull
  List<WarpScriptMacroValueExpr> getMacroValueExprList();

}
