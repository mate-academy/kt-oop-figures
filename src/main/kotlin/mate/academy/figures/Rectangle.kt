package mate.academy.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(val length: Double, val width: Double, override val color: Color) : Figure {
    override fun getArea(): Double = length * width

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, "
                + "length: $length units, width: $width units, color: $color")
    }
}
