package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class RightTriangle(color: Color, private var side: Int) : Figure(color) {
    override fun draw() {
        println("Draw right triangle with color $color and side $side")
    }
}
