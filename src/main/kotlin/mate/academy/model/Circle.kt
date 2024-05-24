package mate.academy.model

import kotlin.math.PI
import kotlin.math.sqrt

class Circle(private val color: Color, private val radius: Double) : Figure(color) {
    private val area = calculateArea()

    override fun calculateArea(): Double {
        return sqrt(radius) * PI
    }

    override fun draw() {
        println("Figure: circle, area: $area sq. units, radius: $radius units, color: $color")
    }
}
