package mate.academy.figure

import mate.academy.model.Color

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double) : Figure(color){
    override fun draw() {
        println("Figure: Right Triangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }
}
