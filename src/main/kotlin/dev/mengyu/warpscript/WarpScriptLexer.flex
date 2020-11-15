package dev.mengyu.warpscript;

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

SPACE=[ \t\n\x0B\f\r]+
COMMENT=("//"|#).*
INT=[0-9]+
DOUBLE=[0-9]+(\.[0-9]*)?
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
MULSTRING=<'([^<'>\\]|\\.)*'>
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
  "$"                { return VAR_PREFIX; }
  "@"                { return MACRO_PREFIX; }
  "NULL"             { return NULL; }
  "IFT"              { return IFT; }
  "IFTE"             { return IFTE; }
  "TRUE"             { return TRUE; }
  "FALSE"            { return FALSE; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {INT}              { return INT; }
  {DOUBLE}           { return DOUBLE; }
  {STRING}           { return STRING; }
  {MULSTRING}        { return MULSTRING; }
  {ID}               { return ID; }

}

[^] { return BAD_CHARACTER; }
