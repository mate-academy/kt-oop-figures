package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(
    private val color: Color,
    private val side: Double
) : Figure(
    color
) {
    override fun draw() {
        println("Drawing Square[color=$color, side=$side].")
    }
}
