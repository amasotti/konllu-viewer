package svg

import svg.models.SVGElement

class FakeSVGElement: SVGElement {
    override fun render(): String {
        return "<fake-element />"
    }
}
