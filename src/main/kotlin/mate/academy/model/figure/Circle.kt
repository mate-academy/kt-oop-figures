package mate.academy.model.figure

import kotlin.math.PI
import kotlin.math.round
import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

class Circle(private val radius: Double, color: Color) : Figure(color), AreaCalculator, Drawable {
    override fun calculateArea(): Double {
        return round(PI * radius * radius)
    }

    override fun draw() {
        println(
            "Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: ${color.name.lowercase()}"
        )
    }
}
