package mate.academy.figures

import mate.academy.model.Color

class Circle(val radius: Int, color: Color, type: String = "circle")
    : Figure(color, type) {
    override fun area(): Double = radius * radius * Math.PI

    override fun draw() {
        println("Figure: $type, area: ${area()} sq. units, " +
                "radius: $radius units, color: $color")
    }
}
