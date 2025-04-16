package mate.academy.model

class RightTriangle(
    override val color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure {
    override fun area(): Double = (firstLeg * secondLeg) / 2

    override fun draw() {
        println("Figure: triangle, area: ${area()} sq. units, firstLeg:"
                + " $firstLeg units, secondLeg: $secondLeg units, color: ${color.name.lowercase()}")
    }
}
