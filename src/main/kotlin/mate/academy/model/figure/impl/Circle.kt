package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, private val radius: Double): Figure(color) {
    override fun area() = PI * radius.pow(2)

    override fun draw() {
        println("Figure: circle, area: ${area()} sq. units," +
                " radius: $radius units, color: $color")
    }
}
