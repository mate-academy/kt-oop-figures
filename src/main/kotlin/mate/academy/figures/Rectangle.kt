package mate.academy.figures

import mate.academy.model.Color

class Rectangle(
    color: Color,
    private val length: Double,
    private val width: Double) : Figure(color) {

    override fun getArea(): Double {
        return length * width
    }

    override fun print() {
        println("Figure: rectangle, area: ${getArea()} sq. units," +
                " length: $length units," +
                " width: $width units," +
                " color: $color")
    }
}
