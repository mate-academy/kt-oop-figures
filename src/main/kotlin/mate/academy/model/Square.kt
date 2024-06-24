package mate.academy.model

class Square(
    color: Color,
    val side: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea(): Double {
        return side.times(side).toDouble()
    }

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            "Figure: $figureName, " +
                    "area: ${getArea()} sq.units, " +
                    "side: $side units, " +
                    "color: ${getColor(figure)}"
        )
    }
}
