package mate.academy.model

class RightTriangle(
    color: Color, private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {

    companion object {
        private const val HALF = 0.5
    }

    override fun getArea(): Double {
        return HALF * firstLeg * secondLeg
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${getArea()} sq. units, firstLeg: $firstLeg units, " +
                    "secondLeg: $secondLeg units, color: $color"
        )
    }
}
