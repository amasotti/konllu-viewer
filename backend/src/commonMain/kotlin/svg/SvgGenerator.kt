package svg

import models.*

fun calculateNodePositions(sentence: Sentence): List<NodePosition> {
    val positions = mutableListOf<NodePosition>()
    val y = 50  // Fixed Y-coordinate for all nodes
    var x = 50  // Starting X-coordinate

    for (token in sentence.tokens) {
        positions.add(NodePosition(x, y))
        x += 120  // Increment X-coordinate for the next node
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
            svgEdges.append("""
                <path d="M${from.x} ${from.y} L${to.x} ${to.y}" style="stroke:black;stroke-width:1" />
                <path d="M${to.x} ${to.y} l3 -14 l-6 0 Z" style="fill:black;stroke:black;stroke-width:1" />
            """.trimIndent())
        }
    }

    return svgEdges.toString()
}

fun addLabels(sentence: Sentence, positions: List<NodePosition>): String {
    val svgLabels = StringBuilder()

    for ((index, token) in sentence.tokens.withIndex()) {
        val position = positions[index]
        svgLabels.append("""
            <rect x="${position.x - 20}" y="${position.y - 20}" width="40" height="40" style="fill:#D0E0FF;stroke:black;stroke-width:1" />
            <text x="${position.x}" y="${position.y + 5}" font-family="Verdana" font-size="16" text-anchor="middle" fill="black">${token.form}</text>
            <text x="${position.x}" y="${position.y + 20}" font-family="Verdana" font-size="12" text-anchor="middle" fill="black">${token.lemma}</text>
        """.trimIndent())
    }

    return svgLabels.toString()
}

fun generateSVG(sentence: Sentence): String {
    val positions = calculateNodePositions(sentence)
    val edges = drawEdges(sentence, positions)
    val labels = addLabels(sentence, positions)

    return """
        <svg height="500" width="500">
            <g class="normal" style="">
                $edges
                $labels
            </g>
        </svg>
    """.trimIndent()
}
