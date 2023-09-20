package svg

import kotlin.test.Test
import kotlin.test.assertEquals
import models.Sentence
import models.tokenMock1
import models.tokenMock2

class SVGGeneratorTest {

    @Test
    fun theRenderMethodShouldGenerateSVGwithCorrectElements() {
        // Arrange
        val sentence = Sentence(
            metadata = mapOf("text" to "Hello world"),
            tokens = listOf(
                tokenMock1,
                tokenMock2
            )
        )
        val svgGenerator = SVGGenerator(sentence)
        val expectedSVG = """
<svg xmlns="http://www.w3.org/2000/svg" version="1.1" width="750" height="500">
<rect 
    x="0" 
    y="250" 
    width="120" 
    height="80" 
    fill="#98FF98" 
    stroke="black" 
    stroke-width="1px" 
/>
<text 
    x="20" 
    y="280" 
    class="form"
    fill="black" 
    stroke-width="1px" 
>word</text>
<text 
    x="20" 
    y="310" 
    class="lemma"
    fill="black" 
    stroke-width="1px" 
>lemma</text>
<rect 
    x="145" 
    y="250" 
    width="100" 
    height="80" 
    fill="#98FF98" 
    stroke="black" 
    stroke-width="1px" 
/>
<text 
    x="165" 
    y="280" 
    class="form"
    fill="black" 
    stroke-width="1px" 
>is</text>
<text 
    x="165" 
    y="310" 
    class="lemma"
    fill="black" 
    stroke-width="1px" 
>be</text>
<path 
id="path_1_2"
d="M60 250 
L60 100 
L195 100
L195 250"
style="stroke: black; stroke-width: 1px; fill: transparent;" />
<text 
    x="127" 
    y="90" 
    class="deprel"
    fill="black" 
    stroke-width="1px" 
>nsubj | NOUN</text>
<path 
id="path_2_0" 
class="relation" 
d="M215 250 L215 150" 
style="stroke: black; stroke-width: 1px; fill: transparent;" />
<text 
    x="185" 
    y="140" 
    class="deprel"
    fill="black" 
    stroke-width="1px" 
>ROOT | VERB</text>
</svg>"""

        // Act
        val actualSVG = svgGenerator.render()

        // Assert
        assertEquals(expectedSVG.trimIndent(), actualSVG.trimIndent())
    }
}
