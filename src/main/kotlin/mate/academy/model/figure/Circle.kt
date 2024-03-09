package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figure

class Circle(
    private val radius: Int,
    private val color: Color
) : Figure(color) {
    override fun draw() = println("There’s a circle drawn with $color color!")

    override fun calculateArea() = (radius * radius * Math.PI).toInt()

    override fun getDescription(): String {
        return "circle, area: ${calculateArea()} sq. units, " +
                "radius: $radius units, " +
                "color: $color."
    }
}
