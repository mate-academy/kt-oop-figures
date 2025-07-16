package mate.academy.model

class RightTriangle(
    override val color: Color,
    private val firstLeg : Double,
    private val secondLeg : Double
) : Figure {

    override fun area(): Double = (firstLeg * secondLeg) / TWO

    override fun draw() {
        println("Figure: right triangle, area: ${area()} sq. units,"
                + " firstLeg: $firstLeg units, "
                + "secondLeg: $secondLeg units, color: $color")
    }
}
