package mate.academy.figure

import mate.academy.model.Color
import kotlin.math.pow

class Square(
    color : Color,
    private val side: Double) : Figure(color) {
    override fun draw() {
        println("""
            Figure: square,
            area: ${getArea()} sq. units,
            side: $side units,
            color: $colour
        """.trimIndent())
    }

    override fun getArea() = side.pow(2)
}
