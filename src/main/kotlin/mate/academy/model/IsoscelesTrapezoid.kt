package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    val base: Int,
    val top: Int,
    val height: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea(): Double {
        return ((base.plus(top)).div(DIVIDER)).times(height).toDouble()
    }

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            "Figure: $figureName, " +
                    "area: ${getArea()} sq.units, " +
                    "base: $base units, " +
                    "top: $top units, " +
                    "height: $height units, " +
                    "color: ${getColor(figure)}"
        )
    }
}
