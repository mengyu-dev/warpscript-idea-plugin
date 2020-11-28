package dev.mengyu.warpscript.feature.style

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import java.util.*


class WarpScriptBlock(
    node: ASTNode, wrap: Wrap, alignment: Alignment,
    private val spacingBuilder: SpacingBuilder
) : AbstractBlock(node, wrap, alignment) {

    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this, child1, child2)
    }

    override fun isLeaf(): Boolean {
        return myNode.firstChildNode == null
    }

    override fun buildChildren(): MutableList<Block> {
        val blocks: MutableList<Block> = ArrayList()
        var child = myNode.firstChildNode
        while (child != null) {
            if (child.elementType !== TokenType.WHITE_SPACE) {
                val block: Block = WarpScriptBlock(
                    child, Wrap.createWrap(WrapType.NONE, false), Alignment.createAlignment(),
                    spacingBuilder
                )
                blocks.add(block)
            }
            child = child.treeNext
        }
        return blocks
    }
}
