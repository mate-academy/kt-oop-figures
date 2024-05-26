package mate.academy.model

private const val MULTIPLIER = 0.5

class RightTriangle(private val firstLeg: Double, private val secondLeg: Double,
                    override val color: Color) : Figure {
    override fun area(): Double = MULTIPLIER * firstLeg * secondLeg

    override fun draw() {
        println("Figure: right triangle, area: ${area()} sq. units, firstLeg: $firstLeg units," +
                " secondLeg: $secondLeg units, color: $color")
    }
}
