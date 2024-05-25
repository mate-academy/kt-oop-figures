package mate.academy.model

import kotlin.math.PI
import kotlin.math.sqrt

class Circle(private val color: Color, private val radius: Double) : Figure(color) {
    override fun calculateArea() = sqrt(radius) * PI

    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: $color")
    }
}
