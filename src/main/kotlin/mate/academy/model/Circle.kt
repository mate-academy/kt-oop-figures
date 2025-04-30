package mate.academy.model

import kotlin.math.PI

class Circle(override val color: Color, private val radius: Int) : Figure {
    private fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun println() {
        val area = calculateArea()
        println("Figure: circle, area: $area sq. units, radius: $radius units, color: ${color.name}")
    }
}
