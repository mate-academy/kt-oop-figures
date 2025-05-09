package mate.academy.model.figure

import mate.academy.model.Color

class Circle(color : Color, private val radius : Double) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius, color: $color")
    }

    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }
}
