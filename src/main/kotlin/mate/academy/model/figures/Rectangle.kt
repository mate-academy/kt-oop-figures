package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(
    private val color: Color,
    private val length: Double,
    private val width: Double
) : Figure(
    color
) {
    override fun draw(){
        println("Drawing Rectangle[color=$color, length=$length, width=$width].")
    }
}
