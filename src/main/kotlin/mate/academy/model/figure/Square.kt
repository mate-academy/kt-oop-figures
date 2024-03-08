package mate.academy.model.figure

import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

class Square(private val side: Double, color: Color) : Figure(color), AreaCalculator, Drawable {
    override fun calculateArea(): Double {
        return round(side * side)
    }

    override fun draw() {
        println(
            "Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: ${color.name.lowercase()}"
        )
    }
}