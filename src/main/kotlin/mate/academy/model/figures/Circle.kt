package mate.academy.model.figures

import mate.academy.model.Color

class Circle(color: Color, private val radius : Int) : Figure(color) {

    override fun getArea() = Math.PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}