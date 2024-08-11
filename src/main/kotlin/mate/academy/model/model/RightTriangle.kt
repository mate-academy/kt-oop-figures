package mate.academy.model.model

import mate.academy.supplier.Color

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {

    override fun draw(): Unit = println(
        "Figure: ${this::class.simpleName}, "
                + "area: ${calculateArea()} sq. units, "
                + "firstLeg: $firstLeg, "
                + "secondLeg $secondLeg, "
                + "color: $color"
    )

    override fun calculateArea(): Double = firstLeg * secondLeg
}