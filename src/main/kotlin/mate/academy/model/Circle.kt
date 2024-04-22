package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius.pow(2)
    }

    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, "
                + "radius: $radius units, color: $color")
    }
}
