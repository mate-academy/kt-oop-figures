package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

const val VALUE_RT = 0.5
class RightTriangle(color: Color,
                    private val firstLeg: Double,
                    private val secondLeg: Double): Figure(color) {
    override fun area() = VALUE_RT * firstLeg * secondLeg

    override fun draw() {
        println("Figure: rightTriangle, area: ${area()} sq. units," +
                " firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
