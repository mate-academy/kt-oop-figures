package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.math.sqrt

class IsoscelesTrapezoid(
    color: Color,
    private val topSide: Double,
    private val downSide: Double,
    private val sideEdge: Double
) : Figure(color) {

    override fun getArea(): Double {
        val halfPerimeter = (topSide + downSide + sideEdge) / 2
        val x = (halfPerimeter - topSide) *
                (halfPerimeter - downSide) *
                (halfPerimeter - sideEdge) *
                (halfPerimeter - sideEdge)
        return sqrt(x)
    }

    override fun draw() {
        println(
            "Figure: IsoscelesTrapezoid, " +
                    "area: ${getArea()} sq.units, " +
                    "sideEdge: $sideEdge units, " +
                    "topSide: $topSide units, " +
                    "downSide: $downSide units, " +
                    "color: $color"
        )
    }
}
