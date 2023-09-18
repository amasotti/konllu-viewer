import models.Sentence
import svg.addLabels
import svg.calculateNodePositions
import svg.drawEdges

fun generateSVG(sentence: Sentence): String {
    val positions = calculateNodePositions(sentence)
    val edges = drawEdges(sentence, positions)
    val labels = addLabels(sentence, positions)

    return """
        $edges
        $labels
    """.trimIndent()
}
