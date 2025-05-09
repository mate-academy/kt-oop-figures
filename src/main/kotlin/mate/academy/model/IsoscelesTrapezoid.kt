package mate.academy.model

import mate.academy.service.Figure

const val TRAPEZOID_FACTOR = 0.5

class IsoscelesTrapezoid(
    override val color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure {

    override fun getArea(): Double = TRAPEZOID_FACTOR * (base1 + base2) * height

    override fun draw() = println(
        """
        Figure: isosceles trapezoid, 
            area: ${getArea()} sq. units, 
            base1: $base1 units, 
            base2: $base2 units, 
            height: $height units, 
            color: $color
    """.trimIndent()
    )
}
