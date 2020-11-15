// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.mengyu.warpscript.psi.impl.*;

public interface WarpScriptTypes {

  IElementType BOOL_LITERAL_EXPR = new WarpScriptElementType("BOOL_LITERAL_EXPR");
  IElementType EXTENSION_CALL_EXPR = new WarpScriptElementType("EXTENSION_CALL_EXPR");
  IElementType FUNC_CALL_EXPR = new WarpScriptElementType("FUNC_CALL_EXPR");
  IElementType ID_EXPR = new WarpScriptElementType("ID_EXPR");
  IElementType LIST_EXPR = new WarpScriptElementType("LIST_EXPR");
  IElementType LITERAL_EXPR = new WarpScriptElementType("LITERAL_EXPR");
  IElementType MACRO_CALL_EXPR = new WarpScriptElementType("MACRO_CALL_EXPR");
  IElementType MACRO_EXPR = new WarpScriptElementType("MACRO_EXPR");
  IElementType MAP_EXPR = new WarpScriptElementType("MAP_EXPR");
  IElementType NATIVE_FUNC_CALL_EXPR = new WarpScriptElementType("NATIVE_FUNC_CALL_EXPR");
  IElementType ONE_VALUE_EXPR = new WarpScriptElementType("ONE_VALUE_EXPR");
  IElementType PROC_EXPR = new WarpScriptElementType("PROC_EXPR");
  IElementType RAW_TYPE_EXPR = new WarpScriptElementType("RAW_TYPE_EXPR");
  IElementType SET_EXPR = new WarpScriptElementType("SET_EXPR");
  IElementType STRING_LITERAL_EXPR = new WarpScriptElementType("STRING_LITERAL_EXPR");
  IElementType VARIABLE_CALL_EXPR = new WarpScriptElementType("VARIABLE_CALL_EXPR");

  IElementType COMMENT = new WarpScriptTokenType("comment");
  IElementType DOUBLE = new WarpScriptTokenType("double");
  IElementType FALSE = new WarpScriptTokenType("FALSE");
  IElementType ID = new WarpScriptTokenType("id");
  IElementType INT = new WarpScriptTokenType("int");
  IElementType LBLOCK = new WarpScriptTokenType("<%");
  IElementType LBRACE = new WarpScriptTokenType("{");
  IElementType LBRACK = new WarpScriptTokenType("[");
  IElementType LPAREN = new WarpScriptTokenType("(");
  IElementType MACRO_PREFIX = new WarpScriptTokenType("@");
  IElementType MULSTRING = new WarpScriptTokenType("mulstring");
  IElementType NULL = new WarpScriptTokenType("NULL");
  IElementType RBLOCK = new WarpScriptTokenType("%>");
  IElementType RBRACE = new WarpScriptTokenType("}");
  IElementType RBRACK = new WarpScriptTokenType("]");
  IElementType RPAREN = new WarpScriptTokenType(")");
  IElementType STRING = new WarpScriptTokenType("string");
  IElementType TRUE = new WarpScriptTokenType("TRUE");
  IElementType VAR_PREFIX = new WarpScriptTokenType("$");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BOOL_LITERAL_EXPR) {
        return new WarpScriptBoolLiteralExprImpl(node);
      }
      else if (type == EXTENSION_CALL_EXPR) {
        return new WarpScriptExtensionCallExprImpl(node);
      }
      else if (type == FUNC_CALL_EXPR) {
        return new WarpScriptFuncCallExprImpl(node);
      }
      else if (type == ID_EXPR) {
        return new WarpScriptIdExprImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new WarpScriptListExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new WarpScriptLiteralExprImpl(node);
      }
      else if (type == MACRO_CALL_EXPR) {
        return new WarpScriptMacroCallExprImpl(node);
      }
      else if (type == MACRO_EXPR) {
        return new WarpScriptMacroExprImpl(node);
      }
      else if (type == MAP_EXPR) {
        return new WarpScriptMapExprImpl(node);
      }
      else if (type == NATIVE_FUNC_CALL_EXPR) {
        return new WarpScriptNativeFuncCallExprImpl(node);
      }
      else if (type == ONE_VALUE_EXPR) {
        return new WarpScriptOneValueExprImpl(node);
      }
      else if (type == PROC_EXPR) {
        return new WarpScriptProcExprImpl(node);
      }
      else if (type == RAW_TYPE_EXPR) {
        return new WarpScriptRawTypeExprImpl(node);
      }
      else if (type == SET_EXPR) {
        return new WarpScriptSetExprImpl(node);
      }
      else if (type == STRING_LITERAL_EXPR) {
        return new WarpScriptStringLiteralExprImpl(node);
      }
      else if (type == VARIABLE_CALL_EXPR) {
        return new WarpScriptVariableCallExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
