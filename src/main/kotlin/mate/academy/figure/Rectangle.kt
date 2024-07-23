package mate.academy.figure

import mate.academy.model.Color

class Rectangle(
    color: Color,
    private val width: Double,
    private val length: Double) : Figure(color) {
    override fun draw() {
        println("Figure: Rectangle, area: ${getArea()} sq. units, "
                + "width: $width units, length: $length units, color: $color")
    }

    override fun getArea(): Double {
        return width * length
    }
}
