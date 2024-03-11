package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round

private const val SQUARE_VALUE = 2

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun draw() {
        println("Figure: circle, "
                + "area: ${calculateArea()} sq. units, "
                + "radius: $radius units, "
                + "color: ${color.name.lowercase()}")
    }

    override fun calculateArea() = round( PI * radius.pow(SQUARE_VALUE))
}
