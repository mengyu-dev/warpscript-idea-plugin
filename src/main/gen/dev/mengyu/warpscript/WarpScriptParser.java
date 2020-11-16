// This is a generated file. Not intended for manual editing.
package dev.mengyu.warpscript;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WarpScriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // long_literal_expr | double_literal_expr | string_literal_expr | bool_literal_expr | null_literal_expr
  public static boolean basic_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_VALUE_EXPR, "<basic value expr>");
    r = long_literal_expr(b, l + 1);
    if (!r) r = double_literal_expr(b, l + 1);
    if (!r) r = string_literal_expr(b, l + 1);
    if (!r) r = bool_literal_expr(b, l + 1);
    if (!r) r = null_literal_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRUE | FALSE | T | F
  public static boolean bool_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_LITERAL_EXPR, "<bool literal expr>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, T);
    if (!r) r = consumeToken(b, F);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // macro_call_expr | func_call_expr
  public static boolean call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_EXPR, "<call expr>");
    r = macro_call_expr(b, l + 1);
    if (!r) r = func_call_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // list_expr | set_expr | map_expr
  public static boolean collection_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLLECTION_VALUE_EXPR, "<collection value expr>");
    r = list_expr(b, l + 1);
    if (!r) r = set_expr(b, l + 1);
    if (!r) r = map_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ift_control_expr | ifte_control_expr
  public static boolean control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_EXPR, "<control expr>");
    r = ift_control_expr(b, l + 1);
    if (!r) r = ifte_control_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE | SDOUBLE
  public static boolean double_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "double_literal_expr")) return false;
    if (!nextTokenIs(b, "<double literal expr>", DOUBLE, SDOUBLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOUBLE_LITERAL_EXPR, "<double literal expr>");
    r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, SDOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( control_expr | call_expr | value_expr )*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    while (true) {
      int c = current_position_(b);
      if (!expr_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // control_expr | call_expr | value_expr
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r;
    r = control_expr(b, l + 1);
    if (!r) r = call_expr(b, l + 1);
    if (!r) r = value_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EXT_FUNC
  public static boolean extension_func_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_func_call_expr")) return false;
    if (!nextTokenIs(b, EXT_FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXT_FUNC);
    exit_section_(b, m, EXTENSION_FUNC_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // extension_func_call_expr | native_func_call_expr
  public static boolean func_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_expr")) return false;
    if (!nextTokenIs(b, "<func call expr>", EXT_FUNC, NATIVE_FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNC_CALL_EXPR, "<func call expr>");
    r = extension_func_call_expr(b, l + 1);
    if (!r) r = native_func_call_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ macro_value_expr | macro_call_expr ] [ macro_value_expr | macro_call_expr ] IFT
  public static boolean ift_control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IFT_CONTROL_EXPR, "<ift control expr>");
    r = ift_control_expr_0(b, l + 1);
    r = r && ift_control_expr_1(b, l + 1);
    r = r && consumeToken(b, IFT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ macro_value_expr | macro_call_expr ]
  private static boolean ift_control_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_0")) return false;
    ift_control_expr_0_0(b, l + 1);
    return true;
  }

  // macro_value_expr | macro_call_expr
  private static boolean ift_control_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_0_0")) return false;
    boolean r;
    r = macro_value_expr(b, l + 1);
    if (!r) r = macro_call_expr(b, l + 1);
    return r;
  }

  // [ macro_value_expr | macro_call_expr ]
  private static boolean ift_control_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_1")) return false;
    ift_control_expr_1_0(b, l + 1);
    return true;
  }

  // macro_value_expr | macro_call_expr
  private static boolean ift_control_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ift_control_expr_1_0")) return false;
    boolean r;
    r = macro_value_expr(b, l + 1);
    if (!r) r = macro_call_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ([  macro_value_expr | macro_call_expr ])? [ macro_value_expr | macro_call_expr ] [ macro_value_expr | macro_call_expr ] IFTE
  public static boolean ifte_control_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IFTE_CONTROL_EXPR, "<ifte control expr>");
    r = ifte_control_expr_0(b, l + 1);
    r = r && ifte_control_expr_1(b, l + 1);
    r = r && ifte_control_expr_2(b, l + 1);
    r = r && consumeToken(b, IFTE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ([  macro_value_expr | macro_call_expr ])?
  private static boolean ifte_control_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0")) return false;
    ifte_control_expr_0_0(b, l + 1);
    return true;
  }

  // [  macro_value_expr | macro_call_expr ]
  private static boolean ifte_control_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0_0")) return false;
    ifte_control_expr_0_0_0(b, l + 1);
    return true;
  }

  // macro_value_expr | macro_call_expr
  private static boolean ifte_control_expr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_0_0_0")) return false;
    boolean r;
    r = macro_value_expr(b, l + 1);
    if (!r) r = macro_call_expr(b, l + 1);
    return r;
  }

  // [ macro_value_expr | macro_call_expr ]
  private static boolean ifte_control_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_1")) return false;
    ifte_control_expr_1_0(b, l + 1);
    return true;
  }

  // macro_value_expr | macro_call_expr
  private static boolean ifte_control_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_1_0")) return false;
    boolean r;
    r = macro_value_expr(b, l + 1);
    if (!r) r = macro_call_expr(b, l + 1);
    return r;
  }

  // [ macro_value_expr | macro_call_expr ]
  private static boolean ifte_control_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_2")) return false;
    ifte_control_expr_2_0(b, l + 1);
    return true;
  }

  // macro_value_expr | macro_call_expr
  private static boolean ifte_control_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifte_control_expr_2_0")) return false;
    boolean r;
    r = macro_value_expr(b, l + 1);
    if (!r) r = macro_call_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LBRACK single_value_expr*  RBRACK
  public static boolean list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPR, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, list_expr_1(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // single_value_expr*
  private static boolean list_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!single_value_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LONG | HEX | BIT
  public static boolean long_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "long_literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LONG_LITERAL_EXPR, "<long literal expr>");
    r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, HEX);
    if (!r) r = consumeToken(b, BIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MACRO_PREFIX ( long_literal_expr | double_literal_expr | MACRO_ID )
  public static boolean macro_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call_expr")) return false;
    if (!nextTokenIs(b, MACRO_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MACRO_PREFIX);
    r = r && macro_call_expr_1(b, l + 1);
    exit_section_(b, m, MACRO_CALL_EXPR, r);
    return r;
  }

  // long_literal_expr | double_literal_expr | MACRO_ID
  private static boolean macro_call_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call_expr_1")) return false;
    boolean r;
    r = long_literal_expr(b, l + 1);
    if (!r) r = double_literal_expr(b, l + 1);
    if (!r) r = consumeToken(b, MACRO_ID);
    return r;
  }

  /* ********************************************************** */
  // LBLOCK expr? RBLOCK
  public static boolean macro_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_value_expr")) return false;
    if (!nextTokenIs(b, LBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBLOCK);
    r = r && macro_value_expr_1(b, l + 1);
    r = r && consumeToken(b, RBLOCK);
    exit_section_(b, m, MACRO_VALUE_EXPR, r);
    return r;
  }

  // expr?
  private static boolean macro_value_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_value_expr_1")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // map_key_expr map_value_expr
  public static boolean map_entry_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_entry_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_ENTRY_EXPR, "<map entry expr>");
    r = map_key_expr(b, l + 1);
    r = r && map_value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE  map_entry_expr*  RBRACE
  public static boolean map_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_EXPR, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, map_expr_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // map_entry_expr*
  private static boolean map_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!map_entry_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING | LONG  | DOUBLE | NULL
  public static boolean map_key_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_key_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_KEY_EXPR, "<map key expr>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_value_expr
  public static boolean map_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_VALUE_EXPR, "<map value expr>");
    r = single_value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NATIVE_FUNC
  public static boolean native_func_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_func_call_expr")) return false;
    if (!nextTokenIs(b, NATIVE_FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NATIVE_FUNC);
    exit_section_(b, m, NATIVE_FUNC_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean null_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_literal_expr")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_LITERAL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> expr
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN single_value_expr*   RPAREN
  public static boolean set_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_expr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SET_EXPR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, set_expr_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // single_value_expr*
  private static boolean set_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!single_value_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "set_expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( expr call_expr ) | call_expr | value_expr
  public static boolean single_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_VALUE_EXPR, "<single value expr>");
    r = single_value_expr_0(b, l + 1);
    if (!r) r = call_expr(b, l + 1);
    if (!r) r = value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr call_expr
  private static boolean single_value_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_value_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && call_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | MSTRING
  public static boolean string_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_expr")) return false;
    if (!nextTokenIs(b, "<string literal expr>", MSTRING, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL_EXPR, "<string literal expr>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, MSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_value_expr | macro_value_expr | basic_value_expr | collection_value_expr
  public static boolean value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_EXPR, "<value expr>");
    r = variable_value_expr(b, l + 1);
    if (!r) r = macro_value_expr(b, l + 1);
    if (!r) r = basic_value_expr(b, l + 1);
    if (!r) r = collection_value_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR_PREFIX ( long_literal_expr | double_literal_expr | VAR_ID )
  public static boolean variable_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_value_expr")) return false;
    if (!nextTokenIs(b, VAR_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR_PREFIX);
    r = r && variable_value_expr_1(b, l + 1);
    exit_section_(b, m, VARIABLE_VALUE_EXPR, r);
    return r;
  }

  // long_literal_expr | double_literal_expr | VAR_ID
  private static boolean variable_value_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_value_expr_1")) return false;
    boolean r;
    r = long_literal_expr(b, l + 1);
    if (!r) r = double_literal_expr(b, l + 1);
    if (!r) r = consumeToken(b, VAR_ID);
    return r;
  }

}
