package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figural
import mate.academy.model.Figure

class RightTriangle(
    private val firstLeg: Double,
    private val secondLeg: Double,
    private val color: Color
) : Figure(color), Figural {

    override fun draw() {
        println("There’s a right triangle drawn with $color color!")
    }

    override fun calculateArea(): Double = (firstLeg * secondLeg) / 2

}
