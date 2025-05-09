package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.FLOOR_NUMBER
import kotlin.math.PI
import kotlin.math.floor

class Circle(val radius: Double, color: Color) : Figure("circle", color) {

    override fun calculateArea(): Double = floor( PI * radius * radius * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println(
            """
            Figure: $name, 
            area: ${calculateArea()} sq. units, 
            radius: $radius units, 
            color: $color
            """.trimIndent()
        )
    }
}
