package mate.academy.service.figure

import mate.academy.model.Color

class Square(
    private val side: Double,
    override val color: Color) : Figure {
    override fun calculateArea(): Double {
        return side * side
    }

    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: "
                + "$side units, color: $color")
    }
}
