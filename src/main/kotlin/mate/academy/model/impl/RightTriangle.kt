package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

private const val MULTIPLIER = 0.5

class RightTriangle(color: Color, private val firstLeg: Double, private val secondLeg: Double) : Figure(color) {
    override fun area(): Double {
        return MULTIPLIER * firstLeg * secondLeg
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${area()} sq. units, firstLeg: $firstLeg"
                    + " units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
