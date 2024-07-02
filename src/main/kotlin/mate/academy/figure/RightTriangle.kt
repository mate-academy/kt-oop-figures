package mate.academy.figure

import mate.academy.model.Color

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double) : Figure(color) {
    override fun draw() {
        println("""
            Figure: right triangle,
            area: ${getArea()} sq. units,
            firstLeg: $firstLeg units,
            secondLeg: $secondLeg units,
            color: $colour
        """.trimIndent())
    }

    override fun getArea() = firstLeg * secondLeg / 2
}
