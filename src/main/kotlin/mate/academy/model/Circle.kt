package mate.academy.model

import mate.academy.service.Figure

class Circle(override val color: Color, private val radius: Double): Figure {

    override fun getArea(): Double = Math.PI * radius * radius

    override fun draw() = println("Figure: circle, area: ${getArea()} sq. units," +
            " radius: $radius units, color: $color")
}
