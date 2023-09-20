package svg

import extensions.half
import models.Sentence
import svg.models.SVGBlock
import svg.models.addPath
import svg.models.addRect
import svg.models.addText


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



class SVGGenerator(private val parsedSentence: Sentence) {
    private val svgBlock: SVGBlock = SVGBlock()
    private val tokenMap = mutableMapOf<Int, Pair<Int, Int>>()

    /**
     * Renders the SVG
     */
    fun render(): String {
        //generateBlocks()
        generateRectangles()
        generatePathsAndLabels()
        return svgBlock.render()
    }

    private fun generateRectangles() {
        var x = 0 // Starting x-coordinate

        parsedSentence.tokens.forEach { token ->
            // Set the width of the rectangle
            val width = maxOf(token.form.length * X_LENGTH_UNIT, RECT_MIN_WIDTH)

            // Add the rectangle
            svgBlock.addRect(
                x = x,
                y = Y_OFFSET,
                width = width,
                height = RECT_HEIGHT,
                text = token.form
            )

            // Add the token form inside the rectangle
            svgBlock.addText(
                text = token.form,
                x = x + TEXT_HORIZONTAL_PADDING,
                y = Y_OFFSET + TEXT_VERTICAL_PADDING,
                cssClass = FORM_CSS_CLASS
            )

            // Add the lemma inside the rectangle
            svgBlock.addText(
                text = token.lemma,
                x = x + TEXT_HORIZONTAL_PADDING,
                y = Y_OFFSET + TEXT_VERTICAL_PADDING * 2,
                cssClass = LEMMA_CSS_CLASS
            )

            // Store the position and width of the rectangle for this token ID
            tokenMap[token.id] = Pair(x, width)

            // Update the x-coordinate for the next rectangle
            x += width + BETWEEN_RECT_GAP
        }

    }

    private fun generatePathsAndLabels() {
        var offsetBezierY = BEZIER_Y_OFFSET_START
        var offsetBezierX = BEZIER_X_OFFSET_START

        for (token in parsedSentence.tokens) {
            val headId = token.head

            if (tokenIsRoot(headId)) {

                svgBlock.addPath(
                    id = "path_${token.id}_$headId",
                    cssClass = PATH_CSS_CLASS,
                    headpos = headId,
                    startX = calculateMiddleOfRectangle(token.id) + BEZIER_X_INCREMENT,
                    endX = 0,
                    startY = Y_OFFSET,
                    endY = Y_OFFSET - (BEZIER_Y_INCREMENT * parsedSentence.tokens.size),
                    controlOffset = 0
                )

                // Add the labels for the paths
                val labelX = (calculateMiddleOfRectangle(token.id) + calculateMiddleOfRectangle(token.id) - offsetBezierX).half()
                val labelY = (Y_OFFSET - (BEZIER_Y_INCREMENT * parsedSentence.tokens.size)).minus(LABEL_VERTICAL_OFFSET)

                val labelText = "ROOT | ${token.upos}"

                svgBlock.addText(
                    text = labelText,
                    x = labelX,
                    y = labelY,
                    cssClass = DEPREL_CSS_CLASS
                )

                continue
            }

            val startX = calculateMiddleOfRectangle(token.id)
            val endX = calculateMiddleOfRectangle(headId) - offsetBezierX

            svgBlock.addPath(
                id = "path_${token.id}_$headId",
                cssClass = PATH_CSS_CLASS,
                headpos = headId,
                startX = startX,
                endX = endX,
                startY = Y_OFFSET,
                endY = Y_OFFSET,
                controlOffset = offsetBezierY
            )

            // Add the labels for the paths
            val labelX = (startX + endX).half()
            val labelY = offsetBezierY.minus(LABEL_VERTICAL_OFFSET)

            val labelText = "${token.deprel} | ${token.upos}"

            svgBlock.addText(
                text = labelText,
                x = labelX,
                y = labelY,
                cssClass = DEPREL_CSS_CLASS
            )

            offsetBezierY += BEZIER_Y_INCREMENT
            offsetBezierX += BEZIER_X_INCREMENT
        }

    }

    private fun tokenIsRoot(tokenID: Int): Boolean {
        return tokenID == -1 || tokenID == 0
    }

    private fun calculateMiddleOfRectangle(tokenID: Int): Int {
        val startX = tokenMap[tokenID]!!.first
        val length = tokenMap[tokenID]!!.second
        return startX + length.half()
    }

}
