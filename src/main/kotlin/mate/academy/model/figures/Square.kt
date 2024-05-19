package mate.academy.model.figures

import mate.academy.model.Color

class Square(color: Color, private val side : Int) : Figure(color) {

    override fun getArea() = (side * side).toDouble()

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}
