package mate.academy.model

import kotlin.math.PI

class Circle(
    val radius: Double,
    color: Color
) : Figure(color) {
    override fun getArea(): Double = PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}
