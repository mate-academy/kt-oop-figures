package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.FLOOR_NUMBER
import kotlin.math.floor

class Rectangle(val width: Double, val height: Double, color: Color) : Figure("rectangle", color) {

    override fun calculateArea(): Double = floor(width * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println(
            """
            Figure: $name, 
            area: ${calculateArea()} sq. units,
            width: $width units, 
            height: $height units, 
            color: $color
            """.trimIndent()
        )
    }
}
