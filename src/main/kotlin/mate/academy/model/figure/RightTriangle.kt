package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figure

class RightTriangle(
    private val firstLeg: Int,
    private val secondLeg: Int,
    private val color: Color
) : Figure(color) {
    override fun draw() = println("There’s a right triangle drawn with $color color!")

    override fun calculateArea() = (firstLeg * secondLeg) / 2

    override fun getDescription(): String {
        return "right triangle, area: ${calculateArea()} sq. units, " +
                "first leg: $firstLeg units, " +
                "second leg: $secondLeg units, " +
                "color: $color."
    }
}
