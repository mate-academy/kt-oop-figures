package mate.academy.model.figure

import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

class RightTriangle(private val firstLeg: Double, private val secondLeg: Double, color: Color) : Figure(color),
    AreaCalculator, Drawable {
    override fun calculateArea(): Double {
        return round(firstLeg * secondLeg * 0.5)
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${calculateArea()} sq. units," +
                    " firstLeg: $firstLeg units, secondLeg: $secondLeg, color: ${color.name.lowercase()}"
        )
    }
}
