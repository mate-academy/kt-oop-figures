package mate.academy.model

class RightTriangle(color: Color, private val firstLeg: Double, private val secondLeg: Double) : Figure(color) {
    override fun draw(): String {
        return "Figure: right triangle, area: ${getArea()} sq. units, firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
    }

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }
}
