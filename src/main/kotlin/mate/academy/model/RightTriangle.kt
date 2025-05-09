package mate.academy.model

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return firstLeg * secondLeg / 2
    }

    override fun draw() {
        println("Figure: right triangle, area: ${calculateArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
