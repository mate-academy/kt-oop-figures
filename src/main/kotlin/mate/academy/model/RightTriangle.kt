package mate.academy.model

import mate.academy.service.Figure

const val COEFFICIENT= 0.5

class RightTriangle(
    override val color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure {

    override fun getArea(): Double = COEFFICIENT * firstLeg * secondLeg

    override fun draw() = println(
        """
        Figure: triangle,
        area: ${getArea()} sq. units,
        firstLeg: $firstLeg units,
        secondLeg: $secondLeg units,
        color: $color
    """.trimIndent()
    )
}
