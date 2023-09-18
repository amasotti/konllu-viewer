package svg

class FakeSVGElement: SVGElement {
    override fun render(): String {
        return "<fake-element />"
    }
}
