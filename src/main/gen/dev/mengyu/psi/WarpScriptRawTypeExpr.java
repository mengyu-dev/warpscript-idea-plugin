// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptRawTypeExpr extends PsiElement {

  @Nullable
  WarpScriptListExpr getListExpr();

  @Nullable
  WarpScriptLiteralExpr getLiteralExpr();

  @Nullable
  WarpScriptMacroExpr getMacroExpr();

  @Nullable
  WarpScriptMapExpr getMapExpr();

  @Nullable
  WarpScriptSetExpr getSetExpr();

  @Nullable
  WarpScriptVariableRefExpr getVariableRefExpr();

}
