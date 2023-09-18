package svg

import models.Sentence

class SVGCreator(private val parsedSentence: Sentence) {
    private val svgBlock: SVGBlock = SVGBlock()


    private fun generateBlocks(): Unit {
        var x = 0  // Starting x-coordinate
        val y = 250  // Starting y-coordinate
        val height = 60  // Height of each rectangle
        val gap = 25  // Gap between rectangles
        val tokenMap = mutableMapOf<Int, Pair<Int, Int>>()  // Map to store token ID and its x-coordinate

        for (token in parsedSentence.tokens) {
            // Create a rectangle
            val width = maxOf(token.form.length * 30, 100)
            val rect = SVGRect(x, y, width, height, token.form)
            svgBlock.addElement(rect)

            // Store the x-coordinate and width of the rectangle for this token ID
            tokenMap[token.id] = Pair(x, width)

            // Create text elements inside the rectangle
            val textYOffset = 30  // Vertical offset for text inside rectangle
            val textXOffset = 20  // Horizontal offset for text inside rectangle
            svgBlock.addElement(SVGText(token.form, x + textXOffset, y + textYOffset, "form"))
            svgBlock.addElement(SVGText(token.lemma, x + textXOffset, y + textYOffset + 20, "lemma"))

            // Update x-coordinate for the next rectangle
            x += width + gap
        }

        // Add paths
        // Generate paths
        var offsetBezier = 0
        for (token in parsedSentence.tokens) {
            val headId = token.head
            if (headId != -1 && headId != 0) {

                // Calculations for the Bezier Curve

                // It should start in the middle of the rectangle
                val startX = tokenMap[token.id]!!.first + (tokenMap[token.id]!!.second / 2)
                // It should end in the middle of the rectangle
                val endX = tokenMap[headId]!!.first + (tokenMap[headId]!!.second / 2)

                val path = SVGPath(
                    id = "path_${token.id}_$headId",
                    headpos = headId,
                    startX = startX,
                    endX = endX,
                    startY = y,
                    endY = y,
                    controlOffset = offsetBezier,
                    cssClass = ""
                )
                svgBlock.addElement(path)
                offsetBezier += 50
            }
        }
    }


    fun render(): String {
        generateBlocks()
        return svgBlock.render()
    }


}
