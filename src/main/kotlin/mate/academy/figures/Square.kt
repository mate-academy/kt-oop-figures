package mate.academy.figures

import mate.academy.model.Color

class Square(color: Color, val side: Int): Figure(color) {

    companion object {
        const val FIGURE_NAME = "square"
    }

    override fun draw() {
        println("Figure: $FIGURE_NAME, area: ${getArea()} units, side: $side units, color: $color")
    }

    override fun getArea(): Int{
        return side * side
    }
}
