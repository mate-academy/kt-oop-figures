package mate.academy.model.figure

import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

class Rectangle(private val height: Double, private val width: Double, color: Color) : Figure(color), AreaCalculator,
    Drawable {
    override fun calculateArea(): Double {
        return round(height * width)
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${calculateArea()} sq. units," +
                    " height: $height units, width: $width, color: ${color.name.lowercase()}"
        )
    }
}