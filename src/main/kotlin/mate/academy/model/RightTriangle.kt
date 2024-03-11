package mate.academy.model

import kotlin.math.round

private const val HALF_VALUE = 0.5

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, "
                + "area: ${calculateArea()} sq. units, "
                + "firstLeg: $firstLeg units, "
                + "secondLeg: $secondLeg, "
                + "color: ${color.name.lowercase()}")
    }

    override fun calculateArea() = round( HALF_VALUE * firstLeg * secondLeg)
}
