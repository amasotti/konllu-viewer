package svg

interface SVGElement {
    fun render(): String

    /**
     * Add this element to a block
     */
    fun addToBlock(block: SVGBlock) = block.addElement(this)
}
