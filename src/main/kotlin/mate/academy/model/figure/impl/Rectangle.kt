package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class Rectangle(
    override val color: Color,
    private val firstSide: Double,
    private val secondSide: Double
) : Figure {
    override fun calculateArea(): Double {
        return firstSide * secondSide
    }

    override fun draw() {
        println("Rectangle has color $color and sides: $firstSide, $secondSide")
    }

}
