package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

private const val HALF = 2

class RightTriangle(private val firsLeg: Double,
                    private val secondLeg: Double,
                    color: Color)
    : Figure(color) {

    override fun area(): Double {
        return firsLeg.times(secondLeg).div(HALF)
    }

    override fun draw() {
        println("Figure: Right Triangle, area: ${area()} sq. units, firs leg: " +
                "$firsLeg units, second leg: $secondLeg units, color: $color")
    }
}
