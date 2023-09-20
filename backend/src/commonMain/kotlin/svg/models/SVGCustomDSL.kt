package svg.models

// DSL function for SVGBlock
fun svg(block: SVGBlock.() -> Unit): SVGBlock {
    val svgBlock = SVGBlock()
    svgBlock.block()
    return svgBlock
}

// DSL function for SVGRect from SVGBlock
fun SVGBlock.rect(x: Int, y: Int, width: Int, height: Int, text:String) {
    val rect = SVGRect(x, y, width, height, text)
    addElement(rect)
}


// DSL function for SVGText from SVGBlock
fun SVGBlock.text(text: String, x: Int, y: Int, cssclass: String) {
    val textElement = SVGText(text, x, y, cssclass)
    addElement(textElement)
}

fun SVGBlock.path(
    id: String, cssClass: String, headpos: Int,
    startX: Int, endX: Int,
    startY: Int, endY: Int,
    controlOffset: Int = 80) {
    val path = SVGPath(id, cssClass, headpos, startX, endX, startY, endY, controlOffset)
    addElement(path)
}

