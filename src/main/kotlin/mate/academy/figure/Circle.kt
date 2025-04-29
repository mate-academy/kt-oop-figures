package mate.academy.figure

import mate.academy.model.Color
import kotlin.math.PI

class Circle(
    color: Color,
    private val radius: Double) : Figure(color) {
    override fun draw() {
        println(
        """
        Figure: Circle, area: ${getArea()} sq. units, 
        radius: $radius units, 
        color: $color
        """)
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}
