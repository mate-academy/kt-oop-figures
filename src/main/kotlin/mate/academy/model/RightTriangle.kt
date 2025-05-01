package mate.academy.model

const val TRIANGLE_AREA_MULTIPLIER = 0.5

class RightTriangle(color: Color, private val firstLeg: Double,
                    private val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double = TRIANGLE_AREA_MULTIPLIER * firstLeg * secondLeg
}
