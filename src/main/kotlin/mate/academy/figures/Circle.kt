package mate.academy.figures

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.math.PI

class Circle(val radius: Double, override val color: Color) : Figure {
    override fun getArea(): Double = PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}
