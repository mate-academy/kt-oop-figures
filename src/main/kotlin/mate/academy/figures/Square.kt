package mate.academy.figures

import mate.academy.model.Color

class Square(val side: Int, color: Color, type: String = "square")
    : Figure(color, type) {
    override fun area(): Double = side.toDouble() * side

    override fun draw() {
        println("Figure: $type, area: ${area()} sq. units, " +
                "side: $side units, color: $color")
    }
}
