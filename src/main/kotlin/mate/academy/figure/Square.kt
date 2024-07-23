package mate.academy.figure

import mate.academy.model.Color

class Square(
    color: Color,
    private val side: Double) : Figure(color) {
    override fun draw() {
        println("Figure: Square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }

    override fun getArea(): Double {
        return side * side
    }
}
