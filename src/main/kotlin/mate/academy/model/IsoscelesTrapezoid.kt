package mate.academy.model

class IsoscelesTrapezoid(
    override val color: Color,
    private val firstLeg: Int,
    private val secondLeg: Int,
    private val height: Int
) : Figure {
    private fun calculateArea(): Double {
        return (firstLeg + secondLeg) / 2.0 * height
    }

    override fun println() {
        val area = calculateArea()
        println("Figure: trapezoid, area: $area sq. units, " +
                "firstLeg: $firstLeg units, " +
                "secondLeg: $secondLeg units, color: ${color.name}")
    }
}
