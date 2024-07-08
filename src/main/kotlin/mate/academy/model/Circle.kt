package mate.academy.model

import kotlin.math.ceil
import kotlin.math.pow

class Circle(
    color: Color,
    private val radius: Double
) : Figure(color) {
    override fun calculateArea() = ceil(Math.PI * radius.pow(2))
    override fun draw() =
        """
        Figure: circle, area: ${calculateArea()} sq. units,
        radius: $radius units,
        color: $color
        """.trimIndent().replace("\n", " ")
}
