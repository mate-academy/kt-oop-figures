package mate.academy.figures

import mate.academy.model.Color

class Square(
    color: Color,
    private val side: Double) : Figure(color) {

    override fun getArea(): Double {
        return side * side
    }

    override fun print() {
        println("Figure: square, area: ${getArea()} sq. units," +
                " side: $side units, color: $color")
    }
}
