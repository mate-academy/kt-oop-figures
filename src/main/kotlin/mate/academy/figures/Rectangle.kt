package mate.academy.figures

import mate.academy.model.Color

class Rectangle(color: Color, val width: Int, val height: Int): Figure(color) {

    companion object {
        const val FIGURE_NAME = "rectangle"
    }

    override fun draw() {
        println("Figure: $FIGURE_NAME, area: ${getArea()} sq. units, width: $width units, " +
                "height: $height units, color: $color")
    }

    override fun getArea(): Int {
        return width * height
    }
}
