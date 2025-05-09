package mate.academy.model

import kotlin.math.pow
import kotlin.math.round

private const val SQUARE_VALUE = 2

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun draw() {
        println("Figure: square, "
                + "area: ${calculateArea()} sq. units, "
                + "side: $side units, "
                + "color: ${color.name.lowercase()}")
    }

    override fun calculateArea() = round(side.pow(SQUARE_VALUE))
}
