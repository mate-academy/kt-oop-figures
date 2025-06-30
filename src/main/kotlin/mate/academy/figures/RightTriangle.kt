package mate.academy.figures

import mate.academy.model.Color

class RightTriangle(color: Color, val firstLeg: Int, val secondLeg: Int) : Figure(color) {

    companion object {
        const val FIGURE_NAME = "right triangle"
    }

    override fun draw() {
        println("Figure: $FIGURE_NAME, area: ${getArea()} sq. units, " +
                "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }

    override fun getArea(): Int {
        return (firstLeg * secondLeg) / 2
    }
}
