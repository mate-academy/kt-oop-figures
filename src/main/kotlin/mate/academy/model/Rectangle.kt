package mate.academy.model

import mate.academy.contract.AreaCalculable
import mate.academy.contract.Drawable

class Rectangle(
    color: Color,
    val length: Double,
    val width: Double
) : Figure(color), Drawable, AreaCalculable {
    override fun calculateArea(): Double = length * width

    override fun draw() = println(
        "Figure: rectangle," +
                " area: ${calculateArea()} sq. units," +
                " length: $length units," +
                " width: $width units," +
                " color: $color"
    )
}
