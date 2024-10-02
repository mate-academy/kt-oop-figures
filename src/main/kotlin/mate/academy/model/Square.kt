package mate.academy.model

import mate.academy.service.Figure

class Square(override val color: Color, private val side: Double) : Figure {

    override fun getArea(): Double = side * side

    override fun draw() = println(
        """
        Figure: square, 
        area: ${getArea()} sq. units, 
        side: $side units, 
        color: $color
    """.trimIndent()
    )
}
