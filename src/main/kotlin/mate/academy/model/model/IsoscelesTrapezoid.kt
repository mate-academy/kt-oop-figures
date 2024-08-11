package mate.academy.model.model

import mate.academy.supplier.Color

class IsoscelesTrapezoid(
    color: Color,
    private val firstSide: Double,
    private val secondSide: Double,
    private val height: Double
) : Figure(color) {

    override fun draw(): Unit = println(
        "Figure: ${this::class.simpleName}, "
                + "area: ${calculateArea()} sq. units, "
                + "firstSide: $firstSide, "
                + "secondSide: $secondSide, "
                + "height: $height, "
                + "color: $color"
    )

    override fun calculateArea(): Double = (height * (firstSide + secondSide)) / 2
}
