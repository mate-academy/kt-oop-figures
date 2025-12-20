package mate.academy.figures

import mate.academy.model.Color

class Rectangle(val height: Int, val width: Int, color: Color,
                type: String = "rectangle")
    : Figure(color, type) {
    override fun area(): Double = height.toDouble() * width

    override fun draw() {
        println("Figure: $type, area: ${area()} sq. units, " +
                "height: $height units, width: $width units, color: $color")
    }
}
