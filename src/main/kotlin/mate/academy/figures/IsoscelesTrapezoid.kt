package mate.academy.figures

import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color, val topBase: Int, val bottomBase: Int, val height: Int
): Figure(color) {

    companion object {
        const val FIGURE_NAME = "isosceles trapezoid"
    }

    override fun draw() {
        println("Figure: $FIGURE_NAME, area: ${getArea()} sq. units, " +
                "top base: $topBase units, bottom base: $bottomBase units, " +
                "height: $height units, color: $color")
    }

    override fun getArea(): Int {
        return ((topBase + bottomBase) * height) / 2
    }
}
