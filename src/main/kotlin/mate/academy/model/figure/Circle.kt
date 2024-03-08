package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figural
import mate.academy.model.Figure
import kotlin.math.pow

class Circle(
    private val radius: Double,
    private val color: Color
) : Figure(color), Figural {
    override fun draw() {
        println("There’s a circle drawn with $color color!")
    }

    override fun calculateArea(): Double = radius.pow(2.0) * Math.PI
}
