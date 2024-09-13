package mate.academy.figure

import mate.academy.model.Color

class RightTriangle(
    color: Color,
    private val base: Double,
    private val height: Double
) : Figure(color) {
    override fun getAreaOfFigure(): Double {
        return height * base / 2.0
    }

    override fun drawFigure() {
        println(
            "Figure: right triangle, area: ${getAreaOfFigure()} sq. units," +
                    " base: $base units, height: $height units, color: $color"
        )
    }
}
