package mate.academy.figure

import mate.academy.model.Color

class Circle(
    color: Color,
    private val radius: Double
) : Figure(color){
    override fun getAreaOfFigure(): Double {
        return Math.PI * radius * radius
    }

    override fun drawFigure() {
        println(
            "Figure: circle, area: ${getAreaOfFigure()} sq. units," +
                    " radius: $radius units, color: $color"
        )
    }
}
