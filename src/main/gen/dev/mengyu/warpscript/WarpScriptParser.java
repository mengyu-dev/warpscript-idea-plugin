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
  // TRUE | FALSE
  public static boolean bool_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_literal_expr")) return false;
    if (!nextTokenIs(b, "<bool literal expr>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_LITERAL_EXPR, "<bool literal expr>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean extension_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_call_expr")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, EXTENSION_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // macro_call_expr | variable_call_expr | extension_call_expr | native_func_call_expr
  public static boolean func_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_call_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNC_CALL_EXPR, "<func call expr>");
    r = macro_call_expr(b, l + 1);
    if (!r) r = variable_call_expr(b, l + 1);
    if (!r) r = extension_call_expr(b, l + 1);
    if (!r) r = native_func_call_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id  | int  | double
  public static boolean id_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_EXPR, "<id expr>");
    r = consumeToken(b, ID);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACK one_value_expr  RBRACK
  public static boolean list_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_expr")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPR, null);
    r = consumeToken(b, LBRACK);
    p = r; // pin = 1
    r = r && report_error_(b, one_value_expr(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // int | double | string_literal_expr | bool_literal_expr | NULL
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = string_literal_expr(b, l + 1);
    if (!r) r = bool_literal_expr(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MACRO_PREFIX id_expr
  public static boolean macro_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call_expr")) return false;
    if (!nextTokenIs(b, MACRO_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MACRO_PREFIX);
    r = r && id_expr(b, l + 1);
    exit_section_(b, m, MACRO_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // LBLOCK proc_expr? RBLOCK
  public static boolean macro_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr")) return false;
    if (!nextTokenIs(b, LBLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBLOCK);
    r = r && macro_expr_1(b, l + 1);
    r = r && consumeToken(b, RBLOCK);
    exit_section_(b, m, MACRO_EXPR, r);
    return r;
  }

  // proc_expr?
  private static boolean macro_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expr_1")) return false;
    proc_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE { (string | int )  ( raw_type_expr | one_value_expr)  }*  RBRACE
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

  // { (string | int )  ( raw_type_expr | one_value_expr)  }*
  private static boolean map_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!map_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "map_expr_1", c)) break;
    }
    return true;
  }

  // (string | int )  ( raw_type_expr | one_value_expr)
  private static boolean map_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = map_expr_1_0_0(b, l + 1);
    r = r && map_expr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string | int
  private static boolean map_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INT);
    return r;
  }

  // raw_type_expr | one_value_expr
  private static boolean map_expr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map_expr_1_0_1")) return false;
    boolean r;
    r = raw_type_expr(b, l + 1);
    if (!r) r = one_value_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean native_func_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "native_func_call_expr")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, NATIVE_FUNC_CALL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // proc_expr [ macro_call_expr | extension_call_expr | native_func_call_expr ]
  public static boolean one_value_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ONE_VALUE_EXPR, "<one value expr>");
    r = proc_expr(b, l + 1);
    r = r && one_value_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ macro_call_expr | extension_call_expr | native_func_call_expr ]
  private static boolean one_value_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr_1")) return false;
    one_value_expr_1_0(b, l + 1);
    return true;
  }

  // macro_call_expr | extension_call_expr | native_func_call_expr
  private static boolean one_value_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_value_expr_1_0")) return false;
    boolean r;
    r = macro_call_expr(b, l + 1);
    if (!r) r = extension_call_expr(b, l + 1);
    if (!r) r = native_func_call_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (func_call_expr | raw_type_expr)*
  public static boolean proc_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_expr")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROC_EXPR, "<proc expr>");
    while (true) {
      int c = current_position_(b);
      if (!proc_expr_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "proc_expr", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // func_call_expr | raw_type_expr
  private static boolean proc_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "proc_expr_0")) return false;
    boolean r;
    r = func_call_expr(b, l + 1);
    if (!r) r = raw_type_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // literal_expr | variable_call_expr | macro_expr |  list_expr | set_expr | map_expr
  public static boolean raw_type_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_type_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_TYPE_EXPR, "<raw type expr>");
    r = literal_expr(b, l + 1);
    if (!r) r = variable_call_expr(b, l + 1);
    if (!r) r = macro_expr(b, l + 1);
    if (!r) r = list_expr(b, l + 1);
    if (!r) r = set_expr(b, l + 1);
    if (!r) r = map_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> proc_expr
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_0(b, l + 1);
    r = r && proc_expr(b, l + 1);
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
  // LPAREN one_value_expr  RPAREN
  public static boolean set_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_expr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SET_EXPR, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, one_value_expr(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // string | mulstring
  public static boolean string_literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_expr")) return false;
    if (!nextTokenIs(b, "<string literal expr>", MULSTRING, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL_EXPR, "<string literal expr>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, MULSTRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR_PREFIX id_expr
  public static boolean variable_call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_call_expr")) return false;
    if (!nextTokenIs(b, VAR_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR_PREFIX);
    r = r && id_expr(b, l + 1);
    exit_section_(b, m, VARIABLE_CALL_EXPR, r);
    return r;
  }

}
