package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class RightTriangle(val firstLeg: Double, val secondLeg: Double, override val color: Color) : Figure {
    companion object {
        private const val AREA_FACTOR = 0.5
    }

    override fun calculateArea(): Double = AREA_FACTOR * firstLeg * secondLeg

    override fun draw() {
        println(
            "Figure: right triangle, area: ${calculateArea()} sq. units," +
                    " firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
