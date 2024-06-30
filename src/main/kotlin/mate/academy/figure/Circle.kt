package mate.academy.figure

import mate.academy.model.Color
import kotlin.math.pow

private const val PI = 3.14

class Circle(
    color: Color,
    private val radius: Double) : Figure(color) {
    override fun draw() {
        println("Figure: circle, "
                + "area: ${getArea()} sq. units, "
                + "radius: $radius units, "
                + "color: $colour")
    }

    override fun getArea() = radius.pow(2) * PI
}