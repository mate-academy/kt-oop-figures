package mate.academy.model

import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt

private const val SQUARE_VALUE = 2
private const val HALF_VALUE = 0.5

class IsoscelesTrapezoid(
    color: Color,
    private val shortSide: Double,
    private val longSide: Double,
    private val leg: Double,
) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, "
                + "area: ${calculateArea()} sq. units, "
                + "shortBase: $shortSide units, "
                + "longBase: $longSide, "
                + "leg: $leg, "
                + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): Double {
        val sidesDifference = longSide - shortSide
        val height = sqrt(leg.pow(SQUARE_VALUE) - sidesDifference.pow(SQUARE_VALUE))
        return round((shortSide + longSide) * HALF_VALUE * height)
    }
}
