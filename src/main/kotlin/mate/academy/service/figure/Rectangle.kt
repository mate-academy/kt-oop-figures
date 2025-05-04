package mate.academy.service.figure

import mate.academy.model.Color

class Rectangle(
    private val length: Double,
    private val width: Double,
    override val color: Color) : Figure {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun draw() {
        println("Figure: rectangle, area: ${calculateArea()} sq. units, length: "
                + "$length units, width: $width units, color: $color")
    }
}
