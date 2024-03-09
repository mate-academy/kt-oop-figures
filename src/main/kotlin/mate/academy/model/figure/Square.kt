package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(
    private val sideA: Int,
    private val color: Color
) : Figure(color) {
    override fun draw() = println("There’s a square drawn with $color color!")

    override fun calculateArea() = sideA * sideA

    override fun getDescription(): String {
        return "square, area: ${calculateArea()} sq. units, " +
                "side: $sideA units, " +
                "color: $color."
    }
}
