package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class IsoscelesTrapezoid(
    val upperBase: Double,
    val lowerBase: Double,
    val height: Double,
    override val color: Color
) : Figure {
    override fun calculateArea(): Double = 0.5 * (upperBase + lowerBase) * height

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, upperBase: $upperBase units," +
                    " lowerBase: $lowerBase units, height: $height units, color: $color"
        )
    }
}
