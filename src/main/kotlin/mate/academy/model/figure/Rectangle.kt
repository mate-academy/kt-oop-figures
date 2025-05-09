package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(
    private val sideA: Int,
    private val sideB: Int,
    private val color: Color
) : Figure() {
    override fun draw() = println("There’s a rectangle drawn with $color color!")

    override fun calculateArea() = sideA * sideB

    override fun getDescription(): String {
        return "rectangle, area: ${calculateArea()} sq. units, " +
                "first side: $sideA units, " +
                "second side: $sideB units, " +
                "color: $color."
    }
}
