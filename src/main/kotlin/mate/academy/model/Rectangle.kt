package mate.academy.model

class Rectangle(
    color: Color,
    val sideA: Int,
    val sideB: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea(): Double {
        return sideA.times(sideB).toDouble()
    }

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            "Figure: $figureName, " +
                    "area: ${getArea()} sq.units, " +
                    "sideA: $sideA units, " +
                    "sideB: $sideB units, " +
                    "color: ${getColor(figure)}"
        )
    }
}
