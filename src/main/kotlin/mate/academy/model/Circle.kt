package mate.academy.model

import kotlin.math.PI

class Circle(color: Color, private val radius: Double): Figure(color) {
    override fun getArea(): Double {
        return PI * radius * radius
    }

    override fun draw(){
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}
