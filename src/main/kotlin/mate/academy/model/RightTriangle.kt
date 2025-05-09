package mate.academy.model

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {

    override fun area(): Double = firstLeg * secondLeg / 2

    override fun draw() {
        println(
            "Figure: right triangle, area: ${area()} sq. units, " +
            "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
