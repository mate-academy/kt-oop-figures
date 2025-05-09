package mate.academy.model

import mate.academy.enums.Color
import mate.academy.service.FOUR
import kotlin.math.sqrt

class IsoscelesTrapezoid(private val upperBase: Double, private val bottomBase: Double,
                         private val side: Double, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: isoscelesTrapezoid"
                + " area:" + getArea()
                + " sq.units, upperBase: " + upperBase
                + " units, bottomBase: " + bottomBase
                + " units, side: " + side
                + " units, color: " + color);
    }

    override fun getArea(): Double {
        return ((upperBase + bottomBase) / 2) *
                    sqrt(side * side - ((bottomBase - upperBase)
                                * (bottomBase - upperBase)) / FOUR)
    }
}
