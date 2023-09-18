package svg

class SVGBlock: SVGElement {
    val elements: MutableList<SVGElement> = mutableListOf()

    fun addElement(element: SVGElement) {
        elements.add(element)
    }

    fun removeElement(element: SVGElement) {
        elements.remove(element)
    }

    override fun render(): String = buildString  {
        wrapSvg(elements) {
            it.render()
        }
    }


}
