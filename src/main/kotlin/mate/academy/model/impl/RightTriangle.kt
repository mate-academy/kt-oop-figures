package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.AreaCalculator

class RightTriangle(color: Color, private val firstLeg: Double,
                    private val secondLeg: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double = (firstLeg * secondLeg) / 2

    override fun draw() {
        println("Figure: Right Triangle, area: ${getArea()} sq.units, firstLeg: "
                    + " $firstLeg units, secondLeg: $secondLeg units, color:  + $color")
    }
}