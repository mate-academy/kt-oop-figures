package mate.academy.model

import kotlin.math.PI

class Circle(val radius: Double, val color: Color) : Figure {

    override fun getArea(): Double {
        return PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: ${color.name.lowercase()}")
    }
}
