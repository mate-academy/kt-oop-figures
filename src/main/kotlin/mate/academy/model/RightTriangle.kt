package mate.academy.model

const val HALF = 0.5
class RightTriangle(
    override val color: Color,
    private val firstLeg: Int,
    private val secondLeg: Int
) : Figure {
    private fun calculateArea(): Double {
        return HALF * firstLeg * secondLeg
    }

    override fun println() {
        val area = calculateArea()
        println("Figure: triangle, area: $area sq. units, " +
                "firstLeg: $firstLeg units, " +
                "secondLeg: $secondLeg units, color: ${color.name}")
    }
}
