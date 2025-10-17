package mate.academy.figures

import mate.academy.model.Color
import mate.academy.model.Figure

private const val PART = 0.5

class RightTriangle(val firstLeg: Double, val secondLeg: Double, override val color: Color) : Figure {
    override fun getArea(): Double = PART * firstLeg * secondLeg

    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
