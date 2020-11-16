// This is a generated file. Not intended for manual editing.
package dev.mengyu.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WarpScriptValueExpr extends PsiElement {

  @Nullable
  WarpScriptBasicValueExpr getBasicValueExpr();

  @Nullable
  WarpScriptCollectionValueExpr getCollectionValueExpr();

  @Nullable
  WarpScriptMacroValueExpr getMacroValueExpr();

  @Nullable
  WarpScriptVariableValueExpr getVariableValueExpr();

}
