package mate.academy.model.figures

import mate.academy.model.Color

const val TRAPEZOID_AREA_COEFFICIENT = 0.5

class IsoscelesTrapezoid(
    color: Color,
    private val firstSide : Int,
    private val secondSide : Int,
    private val height : Int) : Figure(color) {

    override fun getArea() = TRAPEZOID_AREA_COEFFICIENT * height * (firstSide * secondSide)

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, "
                + "firstSide: $firstSide units, secondSide: $secondSide units, height: $height units, color: $color")
    }
}
