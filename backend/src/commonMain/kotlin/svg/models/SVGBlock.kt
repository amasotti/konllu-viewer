package svg.models

import extensions.wrapSvg


const val DEFAULT_STROKE_COLOR = "black"
const val DEFAULT_STROKE_WIDTH = "1px"
const val DEFAULT_FILL_COLOR = "transparent"

/**
 * A block is a collection of elements and represents the SVG element
 * that will be rendered
 *
 * @see SVGElement
 *
 * @property elements the elements that will be rendered, a collection of SVGElement
 *
 */
class SVGBlock: SVGElement {
    private val elements: MutableList<SVGElement> = mutableListOf()

    fun addElement(element: SVGElement) {
        elements.add(element)
    }

    fun removeElement(element: SVGElement) {
        elements.remove(element)
    }

    override fun render(): String = buildString  {
        wrapSvg(elements) {
            it.render().trimIndent().trim()
        }
    }


}
