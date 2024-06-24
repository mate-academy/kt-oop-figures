package mate.academy.model

class Circle(
    color: Color,
    val radius: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea(): Double {
        return Math.PI.times(radius).times(radius)
    }

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            "Figure: $figureName, " +
                    "area: ${getArea()} sq.units, " +
                    "radius: $radius units, " +
                    "color: ${getColor(figure)}"
        )
    }
}
