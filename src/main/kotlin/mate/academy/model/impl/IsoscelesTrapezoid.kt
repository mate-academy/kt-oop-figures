package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.service.AreaCalculator

class IsoscelesTrapezoid(color: Color, private val paralelSideFirst : Double,
                         private val paralelSideSecond : Double,
                         private val height : Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double =
        ((paralelSideFirst + paralelSideSecond) / 2) * height


    override fun draw() {
        println("Figure: IsoscelesTrapezoid, " +
                "area: ${getArea()} sq.units, " +
                "paralelSideFirst: $paralelSideFirst units, " +
                "paralelSideSecond: $paralelSideSecond units, " +
                "height: $height units, " +
                "color: $color")
    }
}
