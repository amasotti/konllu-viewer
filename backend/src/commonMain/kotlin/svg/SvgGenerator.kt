package svg

import models.Sentence

fun calculateNodePositions(sentence: Sentence): List<NodePosition> {
    val positions = mutableListOf<NodePosition>()
    val y = 50  // Fixed Y-coordinate for all nodes
    var x = 50  // Starting X-coordinate

    for (token in sentence.tokens) {
        positions.add(NodePosition(x, y))
        x += 100  // Increment X-coordinate for the next node
    }

    return positions
}


fun drawEdges(sentence: Sentence, positions: List<NodePosition>): String {
    val svgEdges = StringBuilder()

    for (token in sentence.tokens) {
        val head = token.head
        if (head > 0) {
            val from = positions[head - 1]
            val to = positions[token.id - 1]
            svgEdges.append("""<line x1="$from.x" y1="$from.y" x2="$to.x" y2="$to.y" style="stroke:black;stroke-width:2" />""")
        }
    }

    return svgEdges.toString()
}

fun addLabels(sentence: Sentence, positions: List<NodePosition>): String {
    val svgLabels = StringBuilder()

    for ((index, token) in sentence.tokens.withIndex()) {
        val position = positions[index]
        svgLabels.append("""<text x="${position.x}" y="${position.y + 20}" font-family="Verdana" font-size="24" fill="black">${token.form}</text>""")
    }

    return svgLabels.toString()
}

fun generateSVG(sentence: Sentence): String {
    val positions = calculateNodePositions(sentence)
    val edges = drawEdges(sentence, positions)
    val labels = addLabels(sentence, positions)

    return """
        <svg height="500" width="500">
            $edges
            $labels
        </svg>
    """.trimIndent()
}
