package mate.academy.figure

import mate.academy.model.Color

class Rectangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    override fun getAreaOfFigure(): Double {
        return firstLeg * secondLeg
    }

    override fun drawFigure() {
        println(
            "Figure: rectangle, area: ${getAreaOfFigure()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
