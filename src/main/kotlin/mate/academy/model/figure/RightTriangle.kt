package mate.academy.model.figure

import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

private const val ZERO_POINT_FIVE = 0.5

class RightTriangle(private val firstLeg: Double, private val secondLeg: Double, color: Color) : Figure(color),
    AreaCalculator, Drawable {
    override fun calculateArea(): Double {
        return round(firstLeg * secondLeg * ZERO_POINT_FIVE)
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${calculateArea()} sq. units," +
                    " firstLeg: $firstLeg units, secondLeg: $secondLeg, color: ${color.name.lowercase()}"
        )
    }
}
