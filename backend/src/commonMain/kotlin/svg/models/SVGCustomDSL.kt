package svg.models

// DSL function for SVGBlock
fun svg(block: SVGBlock.() -> Unit): SVGBlock {
    val svgBlock = SVGBlock()
    svgBlock.block()
    return svgBlock
}

// DSL function for SVGRect from SVGBlock
fun SVGBlock.addRect(x: Int, y: Int, width: Int, height: Int, text:String) {
    val rect = SVGRect(x, y, width, height, text)
    addElement(rect)
}


// DSL function for SVGText from SVGBlock
fun SVGBlock.addText(text: String, x: Int, y: Int, cssClass: String) {
    val textElement = SVGText(text, x, y, cssClass)
    addElement(textElement)
}

fun SVGBlock.addPath(
    id: String, cssClass: String, headpos: Int,
    startX: Int, endX: Int,
    startY: Int, endY: Int,
    controlOffset: Int = 80) {
    val path = SVGPath(id, cssClass, headpos, startX, endX, startY, endY, controlOffset)
    addElement(path)
}

