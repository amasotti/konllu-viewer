package svg

import extensions.half
import models.Sentence
import svg.models.SVGBlock
import svg.models.SVGPath
import svg.models.SVGRect
import svg.models.SVGText

const val Y_OFFSET = 250
const val X_LENGTH_UNIT = 30

const val RECT_MIN_WIDTH = 100
const val RECT_HEIGHT = 80
const val BETWEEN_RECT_GAP = 25

const val TEXT_HORIZONTAL_PADDING = 20
const val TEXT_VERTICAL_PADDING = 30

const val BEZIER_Y_OFFSET_START = 100
const val BEZIER_X_OFFSET_START = 0
const val BEZIER_X_INCREMENT = 20
const val BEZIER_Y_INCREMENT = 50

const val LABEL_VERTICAL_OFFSET = 10

const val LEMMA_CSS_CLASS = "lemma"
const val FORM_CSS_CLASS = "form"
const val DEPREL_CSS_CLASS = "deprel"
const val PATH_CSS_CLASS = "relation"



class SVGCreator(private val parsedSentence: Sentence) {
    private val svgBlock: SVGBlock = SVGBlock()

    /**
     * Renders the SVG
     */
    fun render(): String {
        generateBlocks()
        return svgBlock.render()
    }


    private fun generateBlocks() {
        var x = 0  // Starting x-coordinate
        val tokenMap = mutableMapOf<Int, Pair<Int, Int>>()  // Map to store token ID and its x-coordinate

        for (token in parsedSentence.tokens) {
            // Create a rectangle
            val width = maxOf(token.form.length * X_LENGTH_UNIT, RECT_MIN_WIDTH)
            val rect = SVGRect(x, Y_OFFSET, width, RECT_HEIGHT, token.form)
            svgBlock.addElement(rect)

            // Store the x-coordinate and width of the rectangle for this token ID
            tokenMap[token.id] = Pair(x, width)

            // Create text elements inside the rectangle
            SVGText(
                token.form,
                x + TEXT_HORIZONTAL_PADDING,
                Y_OFFSET + TEXT_VERTICAL_PADDING,
                FORM_CSS_CLASS).addToBlock(svgBlock)


            SVGText(
                    token.lemma,
                    x + TEXT_HORIZONTAL_PADDING,
                    Y_OFFSET + TEXT_VERTICAL_PADDING,
                    LEMMA_CSS_CLASS)
                .addToBlock(svgBlock)

            // Update x-coordinate for the next rectangle
            x += width + BETWEEN_RECT_GAP
        }

        // Add paths
        // Generate paths
        var offsetBezierY = BEZIER_Y_OFFSET_START
        var offsetBezierX = BEZIER_X_OFFSET_START
        for (token in parsedSentence.tokens) {
            val headId = token.head
            if (headId != -1 && headId != 0) {

                // Calculations for the Bezier Curve

                // It should start in the middle of the rectangle
                val startX = tokenMap[token.id]!!.first + (tokenMap[token.id]!!.second / 2)
                // It should end in the middle of the rectangle
                val endX = tokenMap[headId]!!.first + (tokenMap[headId]!!.second / 2) - offsetBezierX

                val path = SVGPath(
                    id = "path_${token.id}_$headId",
                    headpos = headId,
                    startX = startX,
                    endX = endX,
                    startY = Y_OFFSET,
                    endY = Y_OFFSET,
                    controlOffset = offsetBezierY,
                    cssClass = PATH_CSS_CLASS
                )
                svgBlock.addElement(path)


                // Add the labels for the paths
                val labelX = (startX + endX).half()
                val labelY = offsetBezierY.minus(LABEL_VERTICAL_OFFSET)

                val labelText = "${token.deprel} | ${token.upos}"
                val label = SVGText(labelText, labelX, labelY, DEPREL_CSS_CLASS)
                svgBlock.addElement(label)

                offsetBezierY += BEZIER_Y_INCREMENT
                offsetBezierX += BEZIER_X_INCREMENT
            }
        }
    }

}
