package mate.academy.model

import kotlin.math.PI

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun area(): Double = PI * radius * radius

    override fun draw() {
        println(
            "Figure: circle, area: ${area()} sq. units, " +
                    "radius: $radius units, " +
                    "color: $color")
    }
}
