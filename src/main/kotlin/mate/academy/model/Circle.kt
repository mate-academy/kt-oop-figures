package mate.academy.model

import kotlin.math.PI

class Circle(override val color: Color, private val radius: Int) : Figure {
    override fun getArea(): Double = PI * radius * 2

    override fun draw() {
        println("""
            Figure: circle, 
            area: ${getArea()} sq. units, 
            radius: $radius units, 
            color: $color
            """.trimIndent())
    }
}
