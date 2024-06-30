package mate.academy.figure

import mate.academy.model.Color

class Rectangle(
    color: Color,
    private val length: Double,
    private val height: Double) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, "
                + "area: ${getArea()} sq. units, "
                + "length: $length units, "
                + "height: $height units, "
                + "color: $colour")
    }

    override fun getArea() = length * height
}
