package mate.academy.model

import kotlin.math.pow

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }

    override fun getArea(): Double = radius.pow(2).times(Math.PI)
}
