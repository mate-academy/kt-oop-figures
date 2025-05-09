package mate.academy.model

import kotlin.math.PI

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun draw(): String {
        return "Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color"
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}
