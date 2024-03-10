package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.math.PI
import kotlin.math.pow

class Circle(private val radius : Double, color: Color)
    : Figure(color) {
    override fun area(): Double {
        return PI.times(radius.pow(2))
    }

    override fun draw() {
        println("Figure: Circle, area: ${area()} sq. units, radius: " +
                "$radius units, color: $color")
    }
}
