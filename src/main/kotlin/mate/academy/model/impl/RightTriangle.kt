package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.math.sqrt

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double,
    private val thirdLeg: Double
) : Figure(color) {
    override fun getArea(): Double {
        val halfPerimeter = (firstLeg + secondLeg + thirdLeg) / 2
        val x = halfPerimeter *
                (halfPerimeter - firstLeg) *
                (halfPerimeter - secondLeg) *
                (halfPerimeter - thirdLeg)
        return sqrt(x)
    }

    override fun draw() {
        println(
            "Figure: IsoscelesTrapezoid, " +
                    "area: ${getArea()} sq.units, " +
                    "firstLeg: $firstLeg units, " +
                    "secondLeg: $secondLeg units, " +
                    "thirdLeg: $thirdLeg units, " +
                    "color: $color"
        )
    }
}
