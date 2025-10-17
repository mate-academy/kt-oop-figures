package mate.academy.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(val side: Double, override val color: Color) : Figure {
    override fun getArea(): Double = side * side
    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}
