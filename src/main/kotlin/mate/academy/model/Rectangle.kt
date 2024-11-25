package mate.academy.model

import mate.academy.enums.Color

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double
) : Figure(color) {
    override fun getArea(): Double {
        return width * height
    }

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()}, width: $width, height: $height, color: $color")
    }
}
