package mate.academy.figures

import mate.academy.model.Color

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double) : Figure(color) {

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }

    override fun print() {
        println("Figure: rightTriangle, area: ${getArea()} sq. units," +
                " firstLeg: $firstLeg units," +
                " secondLeg: $secondLeg," +
                " color: $color")
    }
}
