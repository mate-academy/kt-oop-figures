package mate.academy.model.figures

import mate.academy.model.Color

const val RIGHT_TRIANGLE_AREA_COEFFICIENT = 0.5

class RightTriangle(color: Color, private val firstLeg : Int, private val secondLeg : Int) : Figure(color) {
    override fun getArea() = RIGHT_TRIANGLE_AREA_COEFFICIENT * firstLeg * secondLeg

    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }

}
