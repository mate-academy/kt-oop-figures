package mate.academy.model

import kotlin.math.PI

class Circle (private val radius : Double, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${getArea()}. units, radius: $radius units, color: $color")
    }

    override fun getArea(): Double = radius * radius * PI
}
