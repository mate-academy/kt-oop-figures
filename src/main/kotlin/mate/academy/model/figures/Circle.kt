package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Circle(
    private val color: Color,
    private val radius: Double
) : Figure(color) {

    override fun draw() {
        println("Drawing Circle[color=$color, radius=$radius].")
    }
}
