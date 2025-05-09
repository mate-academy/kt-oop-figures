package mate.academy.model.figure

import mate.academy.model.Color

class Rectangle(color: Color, private  val length: Double, private val high: Double) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${calculateArea()} sq. units,"
                + " length: $length, high: ${high}, color: $color")
    }

    override fun calculateArea(): Double {
        return length * high
    }
}
