package mate.academy.model

import kotlin.math.pow

data class Square(
    override var color: String,
    override var base: Double
) : Figure(color, base) {

    override fun area(): Double {
        return base.pow(2)
    }

    override fun draw(): String {
        return "Figure: square, area: ${"%.1f".format(area())} sq. units, side: $base units, color: $color"
    }
}
