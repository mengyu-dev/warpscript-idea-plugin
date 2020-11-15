package dev.mengyu.warpscript.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import dev.mengyu.warpscript.WarpScriptFile
import dev.mengyu.warpscript.WarpScriptLanguage
import dev.mengyu.warpscript.WarpScriptLexerAdapter
import dev.mengyu.warpscript.WarpScriptParser

class WarpScriptTokenType(debugName: String) : IElementType(debugName, WarpScriptLanguage){
    override fun toString(): String {
        return "WarpScriptTokenType." + super.toString()
    }
}

class WarpScriptElementType(debugName: String)  : IElementType(debugName, WarpScriptLanguage)

class WarpScriptParserDefinition : ParserDefinition {
    val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS = TokenSet.create(WarpScriptTypes.COMMENT)
    val FILE = IFileElementType(WarpScriptLanguage)

    override fun createLexer(project: Project)= WarpScriptLexerAdapter()

    override fun createParser(project: Project) = WarpScriptParser()

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode): PsiElement = WarpScriptTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile  = WarpScriptFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): SpaceRequirements {
        return SpaceRequirements.MUST
    }

}