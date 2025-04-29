package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Square(color: Color, private var side: Int) : Figure(color) {
    override fun draw() {
        println("Draw square with color $color and side $side")
    }
}
