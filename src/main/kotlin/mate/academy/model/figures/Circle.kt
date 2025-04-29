package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Circle (color: Color, private var radius: Int) : Figure(color) {
    override fun draw() {
        println("Draw circle with color $color and radius $radius")
    }
}
