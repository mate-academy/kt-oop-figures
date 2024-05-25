package mate.academy.model.figure

import mate.academy.model.Color

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side, color: $color")
    }

    override fun calculateArea(): Double {
        return (side * side)
    }
}
