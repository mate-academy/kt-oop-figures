package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(private val length : Double,
                private val width: Double,
                color: Color)
    : Figure(color) {

    override fun area(): Double {
        return length.times(width)
    }

    override fun draw() {
        println("Figure: Rectangle, area: ${area()} sq. units, length: " +
                "$length units, width: $width units, color: $color")
    }
}
