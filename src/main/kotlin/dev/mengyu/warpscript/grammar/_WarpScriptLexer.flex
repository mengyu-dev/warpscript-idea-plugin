package dev.mengyu.warpscript.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.mengyu.warpscript.psi.WarpScriptTypes.*;

%%

%{
  public _WarpScriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _WarpScriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

VAR_PREFIX=\!?\$
SPACE=[ \t\n\x0B\f\r]+
LCOMMENT=("//".*)|(#.*)
BCOMMENT="/"\*(.|\n)*\*"/"
LONG=[\-\+]?[0-9]+
HEX=0x[0-9]+
DOUBLE=[\-\+]?[0-9]+\.[0-9]*
SDOUBLE=[\-\+]?[0-9]+\.[0-9]*[eE][\-\+]?[0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
MSTRING=<'([^<'>\\]|\\.)*'>
ID=[\p{Alnum}!\\\%&()*+,\-./:;<=>?\[\\\]\^_‘{|}~]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  "["                { return LBRACK; }
  "]"                { return RBRACK; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  "<%"               { return LBLOCK; }
  "%>"               { return RBLOCK; }
  "@"                { return MACRO_PREFIX; }
  "NULL"             { return NULL; }
  "T"                { return T; }
  "true"             { return TRUE; }
  "F"                { return F; }
  "false"            { return FALSE; }
  "IFT"              { return IFT; }
  "IFTE"             { return IFTE; }
  "0b[01]+"          { return BIT; }
// change runtime from ID
//  "MACRO_ID"         { return MACRO_ID; }
//  "EXT_FUNC"         { return EXT_FUNC; }
//  "NATIVE_FUNC"      { return NATIVE_FUNC; }
//  "VAR_ID"           { return VAR_ID; }

  {VAR_PREFIX}       { return VAR_PREFIX; }
  {SPACE}            { return SPACE; }
  {LCOMMENT}         { return LCOMMENT; }
  {BCOMMENT}         { return BCOMMENT; }
  {LONG}             { return LONG; }
  {HEX}              { return HEX; }
  {DOUBLE}           { return DOUBLE; }
  {SDOUBLE}          { return SDOUBLE; }
  {STRING}           { return STRING; }
  {MSTRING}          { return MSTRING; }
  {ID}               { return ID; }

}

[^] { return BAD_CHARACTER; }
