package mate.academy.model

import mate.academy.service.ColorProvider

class IsoscelesTrapezoid(
    private val base1: Double,
    private val base2: Double,
    private val height: Double,
    colorProvider: ColorProvider
) : Figure(colorProvider) {
    companion object {
        private const val HALF_INDEX = 0.5
    }
    override fun area(): Double = HALF_INDEX * (base1 + base2) * height
    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${area()} sq. units, base1: "
                    + "$base1 units, base2: $base2 units, height: $height units, color: $color"
        )
    }
}
