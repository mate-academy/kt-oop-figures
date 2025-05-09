package mate.academy.figure

import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure(color) {
    override fun getAreaOfFigure(): Double {
        return ((base1 + base2) * height) / 2
    }

    override fun drawFigure() {
        println(
            "Figure: isosceles trapezoid, area: ${getAreaOfFigure()} sq. units," +
                    " base 1: $base1 units, base 2: $base2 units, color: $color"
        )
    }
}
