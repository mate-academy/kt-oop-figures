package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow

data class Circle(
    override var color: String,
    override var base: Double
) : Figure(color, base) {
    override fun area(): Double {
        return PI * base.pow(2)
    }

    override fun draw(): String {
        return "Figure: circle, area: ${"%.1f".format(area())} sq. units, radius: $base units, color: $color"
    }
}
