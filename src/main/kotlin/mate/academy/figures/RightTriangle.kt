package mate.academy.figures

import mate.academy.model.Color

const val HALF = 0.5

class RightTriangle(val firstLeg: Int, val secondLeg: Int, color: Color,
                    type: String = "right triangle")
    : Figure(color, type) {
    override fun area(): Double = firstLeg * secondLeg * HALF

    override fun draw() {
        println("Figure: $type, area: ${area()} sq. units, " +
                "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
