package mate.academy.model

class RightTriangle(
    override val color: Color,
    private val firstLeg: Int,
    private val secondLeg: Int
) : Figure {
    override fun getArea(): Double = firstLeg * secondLeg.toDouble() / 2

    override fun draw() {
        println("Figure: rightTriangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
