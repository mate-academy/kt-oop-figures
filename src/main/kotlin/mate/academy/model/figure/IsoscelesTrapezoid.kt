package mate.academy.model.figure

import kotlin.math.sqrt
import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

class IsoscelesTrapezoid(
    private val shortBase: Double,
    private val longBase: Double,
    private val leg: Double,
    color: Color
) : Figure(color), AreaCalculator, Drawable {
    override fun calculateArea(): Double {
        fun calculateHeight(): Double {
            val base = longBase - shortBase
            return round(sqrt(leg * leg - base * base))
        }
        return 0.5 * (shortBase + longBase) * calculateHeight()
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${calculateArea()} sq. units," +
                    " shortBase: $shortBase units, longBase: $longBase, leg: $leg, color: ${color.name.lowercase()}"
        )
    }
}