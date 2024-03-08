package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figural
import mate.academy.model.Figure

class Square(
    private val sideA: Double,
    private val color: Color
) : Figure(color), Figural {

    override fun draw() {
        println("There’s a square drawn with $color color!")
    }

    override fun calculateArea(): Double = sideA * sideA
}
