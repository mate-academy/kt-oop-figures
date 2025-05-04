package mate.academy.service.figure

import mate.academy.model.Color
import kotlin.math.PI

class Circle(
    private val radius: Double,
    override val color: Color) : Figure {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: "
                + "$radius units, color: $color")
    }
}
