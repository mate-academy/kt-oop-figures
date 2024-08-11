package mate.academy.model.model

import mate.academy.supplier.Color

class Rectangle(
    color: Color,
    private val firstSide: Double,
    private val secondSide: Double
) : Figure(color) {

    override fun draw(): Unit = println(
        "Figure: ${this::class.simpleName}, "
                + "area: ${calculateArea()} sq. units, "
                + "firstSide: $firstSide, "
                + "secondLeg: $secondSide, "
                + "color: $color"
    )

    override fun calculateArea(): Double = firstSide * secondSide
}
