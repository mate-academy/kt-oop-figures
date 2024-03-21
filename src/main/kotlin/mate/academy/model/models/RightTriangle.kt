package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class RightTriangle(val firstLeg: Double, val secondLeg: Double, override val color: Color) : Figure {
    override fun calculateArea(): Double = 0.5 * firstLeg * secondLeg

    override fun draw() {
        println(
            "Figure: right triangle, area: ${calculateArea()} sq. units," +
                    " firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
