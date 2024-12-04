package mate.academy.figures

import mate.academy.model.Color
import kotlin.math.PI

class Circle(
    color: Color,
    private val radius: Double) : Figure(color) {

    override fun getArea(): Double {
        return PI * (radius * radius)
    }

    override fun print() {
        println("Figure: circle, area: ${getArea()} sq. units," +
                " radius: $radius units, color: $color")
    }
}
