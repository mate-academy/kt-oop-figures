package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.math.PI
import kotlin.math.pow

class Circle(val radius: Double, override val color: Color) : Figure {
    override fun calculateArea(): Double = PI * radius.pow(2)

    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: $color")
    }
}
