package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.AreaCalculator
import mate.academy.model.Figure

class Square(color: Color, private val side: Double) : Figure(color), AreaCalculator {

    override fun getArea(): Double {
        return (side * side)
    }

    override fun draw() = println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
}
