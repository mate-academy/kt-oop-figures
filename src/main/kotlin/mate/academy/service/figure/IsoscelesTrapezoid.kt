package mate.academy.service.figure

import mate.academy.model.Color

class IsoscelesTrapezoid(
    private val base1: Double,
    private val base2: Double,
    private val height: Double,
    override val color: Color) : Figure {
    override fun calculateArea(): Double {
        return ((base1 + base2) / 2) * height
    }

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, base1: "
                + "$base1 units, base2: $base2 units, height: $height units, color: $color")
    }
}
