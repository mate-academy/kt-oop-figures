package mate.academy.figures

import mate.academy.model.Color
import mate.academy.model.Figure

private const val HALF = 0.5

class IsoscelesTrapezoid(
    val base1: Double,
    val base2: Double,
    val height: Double,
    override val color: Color
) : Figure {
    override fun getArea(): Double = HALF * (base1 + base2) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, "
                + "base1: $base1 units, base2: $base2 units, height: $height units, color: $color")
    }
}
