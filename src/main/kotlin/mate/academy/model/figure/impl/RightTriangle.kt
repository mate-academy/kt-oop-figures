package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class RightTriangle(
    override val color: Color,
    private val firstLeg: Double,
    private val
    secondLeg: Double
) : Figure {
    override fun calculateArea(): Double {
        return (firstLeg * secondLeg) / 2.0
    }

    override fun draw() {
        println("Right triangle have color $color, first leg: $firstLeg, second leg: $secondLeg")
    }

}
