package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figural
import mate.academy.model.Figure

class Rectangle(
    private val sideA: Double,
    private val sideB: Double,
    private val color: Color
) : Figure(color), Figural {

    override fun draw() {
        println("There’s a rectangle drawn with $color color!")
    }

    override fun calculateArea(): Double = sideA * sideB
}
