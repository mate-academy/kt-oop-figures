package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(
    color: Color,
    private val width: Double,
    private val length: Double
) : Figure(color) {
    override fun area(): Double {
        return width * length
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${area()} sq. units, "
                    + "length: $length units, width: $width units, color: $color"
        )
    }
}
