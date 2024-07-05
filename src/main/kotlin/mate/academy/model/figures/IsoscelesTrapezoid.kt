package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class IsoscelesTrapezoid(
    private val color: Color,
    private val length: Double,
    private val width: Double
) : Figure(
    color
) {
    override fun draw() {
        println("Drawing IsoscelesTrapezoid[color=$color, length=$length, width=$width].")
    }
}
