package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.model.Figure

class IsoscelesTrapezoid(color: Color, private var baseA: Int, private var baseB: Int) : Figure(color) {
    override fun draw() {
        println("Draw isosceles trapezoid with color $color, baseA $baseA, and baseB $baseB")
    }
}
