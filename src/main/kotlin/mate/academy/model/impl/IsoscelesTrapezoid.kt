package mate.academy.model.impl

import mate.academy.model.Color
import mate.academy.model.Figure

private const val HALF = 0.5

class IsoscelesTrapezoid(private val shortBase: Double,
                         private val longBase: Double,
                         private val leg: Double,
                         color: Color)
    : Figure(color) {
    override fun area(): Double {
        return HALF * (shortBase + longBase) * leg
    }

    override fun draw() {
        println("Figure: Isosceles Trapezoid, area: ${area()} sq. units, shortBase: " +
                "$shortBase units, longBase: $longBase units, leg: $leg units, color: $color")
    }
}
