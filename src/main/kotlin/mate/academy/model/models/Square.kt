package mate.academy.model.models

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(val side: Double, override val color: Color) : Figure {
    override fun calculateArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: $color")
    }
}
