package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

class Circle(color: Color, private val radius: Double) : Figure(color) {

    override fun area(): Double {
        return Math.PI.times(radius * radius)
    }

    override fun draw() {
        println("Figure: circle, area: ${area()} sq. units, radius: $radius units, color: $color")
    }
}
