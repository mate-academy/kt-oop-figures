package mate.academy.model

import kotlin.math.round

class Rectangle(
    color: Color,
    private val height: Double,
    private val width: Double
) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, "
                + "area: ${calculateArea()} sq. units, "
                + "height: $height units, "
                + "width: $width, "
                + "color: ${color.name.lowercase()}")
    }

    override fun calculateArea() = round(height * width)
}
