package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class IsoscelesTrapezoid(
    val upperBase: Double,
    val lowerBase: Double,
    val height: Double,
    override val color: Color
) : Figure {
    companion object {
        private const val AREA_FACTOR = 0.5
    }

    override fun calculateArea(): Double = AREA_FACTOR * (upperBase + lowerBase) * height

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, upperBase: $upperBase units," +
                    " lowerBase: $lowerBase units, height: $height units, color: $color"
        )
    }
}
