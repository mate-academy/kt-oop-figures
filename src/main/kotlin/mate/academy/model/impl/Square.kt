package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.AreaCalculator

class Square(color: Color, private val side:Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}