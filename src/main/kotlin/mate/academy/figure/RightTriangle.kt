package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.FLOOR_NUMBER
import mate.academy.service.HALF_MULTIPLIER
import kotlin.math.floor

class RightTriangle(val base: Double, val height: Double, color: Color) : Figure("rightTriangle", color) {

    override fun calculateArea(): Double = floor(HALF_MULTIPLIER * base * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println(
            """
            Figure: $name, 
            area: ${calculateArea()} sq. units, 
            base: $base units, 
            height: $height units, 
            color: $color
            """.trimIndent()
        )
    }
}
