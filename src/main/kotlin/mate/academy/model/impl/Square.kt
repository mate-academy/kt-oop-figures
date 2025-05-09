package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(private val side: Double, color: Color) : Figure(color) {
    override fun area(): Double {
        return side.times(side)
    }

    override fun draw() {
        println("Figure: square, area: ${area()} sq. units, side: $side units, color: $color")
    }
}
