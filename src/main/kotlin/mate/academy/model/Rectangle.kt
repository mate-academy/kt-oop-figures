package mate.academy.model

import mate.academy.service.Figure

class Rectangle(override val color: Color, private val width: Double, private val height: Double) : Figure {

    override fun getArea(): Double = width * height

    override fun draw() = println(
        """
        Figure: rectangle, 
        area: ${getArea()} sq. units, 
        width: $width units, 
        height: $height units, 
        color: $color 
    """.trimIndent()
    )
}
