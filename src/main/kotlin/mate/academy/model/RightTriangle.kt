package mate.academy.model

class RightTriangle(color: Color, private val firstLeg: Double, private val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double {
        return firstLeg * secondLeg / 2
    }

    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, first leg: $firstLeg units, "
                + "second leg: $secondLeg units, color: $color")
    }
}
