package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class Rectangle(color: Color,
                private val width: Double,
                private val height: Double): Figure(color) {
    override fun area() = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${area()} sq. units," +
                " width: $width units, height: $height units, color: $color")
    }
}
