package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class Rectangle(color: Color, private var sideA : Int, private var sideB: Int) : Figure(color) {
    override fun draw() {
        println("Draw rectangle with color $color, sideA $sideA, and sideB $sideB")
    }
}
