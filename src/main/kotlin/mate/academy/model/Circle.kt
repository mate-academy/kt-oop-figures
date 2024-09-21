package mate.academy.model

import kotlin.math.PI

class Circle(val color: String, val radius: Double): Figure(color) {
    override fun getArea(): Double {
        return (radius * radius) * PI
    }

    override fun draw() {
        println("Figure: circle, area: ${getArea()}.sq units, radius: $radius, color: $color")
    }
}
