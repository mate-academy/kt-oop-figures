package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figural
import mate.academy.model.Figure

class IsoscelesTrapezoid(
    private val topParallel: Double,
    private val bottomParallel: Double,
    private val height: Double,
    private val color: Color
) : Figure(color), Figural {
    override fun draw() {
        println("There’s a Isosceles trapezoid drawn with $color color!")
    }

    override fun calculateArea(): Double = (topParallel + bottomParallel) / 2 * height
}
