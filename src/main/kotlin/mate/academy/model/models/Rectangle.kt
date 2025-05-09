package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(val length: Double, val width: Double, override val color: Color) : Figure {
    override fun calculateArea(): Double = length * width

    override fun draw() {
        println(
            "Figure: rectangle, area: ${calculateArea()} sq. units," +
                    " length: $length units, width: $width units, color: $color"
        )
    }
}
