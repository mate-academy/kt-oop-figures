package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class Square(color: Color, private val side: Double): Figure(color) {
    override fun area() = side * side

    override fun draw() {
        println("Figure: square, area: ${area()} sq. units," +
                " side: $side units, color: $color")
    }
}
