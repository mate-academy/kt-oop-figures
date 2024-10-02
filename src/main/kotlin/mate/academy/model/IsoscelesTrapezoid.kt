package mate.academy.model

import mate.academy.service.Figure

class IsoscelesTrapezoid(
    override val color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure {

    override fun getArea(): Double = 0.5 * (base1 + base2) * height

    override fun draw() = println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, " +
            "base1: $base1 units, base2: $base2 units, height: $height units, color: $color")
}
