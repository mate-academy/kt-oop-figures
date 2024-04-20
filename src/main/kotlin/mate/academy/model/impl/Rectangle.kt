package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.AreaCalculator

class Rectangle(color: Color, private val firstSide : Double,
                private val secondSide : Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double = firstSide * secondSide

    override fun draw() {
        println("Figure: Rectangle, " +
                "area: ${getArea()} sq.units, " +
                "firstSide: $firstSide units, " +
                "secondSide: $secondSide units, " +
                "color: $color")
    }
}