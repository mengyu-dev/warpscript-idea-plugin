// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptOneValueExpr extends PsiElement {

  @Nullable
  WarpScriptExtensionCallExpr getExtensionCallExpr();

  @Nullable
  WarpScriptMacroCallExpr getMacroCallExpr();

  @Nullable
  WarpScriptNativeFuncCallExpr getNativeFuncCallExpr();

  @NotNull
  WarpScriptProcExpr getProcExpr();

}
