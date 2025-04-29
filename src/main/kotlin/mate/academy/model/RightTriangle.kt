package mate.academy.model

class RightTriangle(color: String, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double = AREA_MULTIPLIER * firstLeg * secondLeg

    override fun draw() = println("Figure: right triangle, area: ${getArea()} sq. units,"
            + " first leg: $firstLeg units, second leg: $secondLeg units, color: $color")
}
