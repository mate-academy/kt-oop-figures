package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radius.pow(2.0)

    override fun draw() = println(
        "Figure: circle," +
                " area: ${calculateArea()} sq. units, color: $color"
    )
}
