package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.AreaCalculator
import mate.academy.model.Figure

class Rectangle(
    color: Color,
    private val firstSide: Double,
    private val secondSide: Double,
) : Figure(color), AreaCalculator {
    override fun getArea(): Double = firstSide * secondSide

    override fun draw() {
        println("Figure: IsoscelesTrapezoid, " +
                "area: ${getArea()} sq.units, " +
                "firstSide: $firstSide units, " +
                "secondSide: $secondSide units, " +
                "color: $color")
    }
}
