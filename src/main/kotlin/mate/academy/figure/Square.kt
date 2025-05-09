package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.FLOOR_NUMBER
import kotlin.math.floor

class Square(val side: Double, color: Color) : Figure("square", color) {

    override fun calculateArea(): Double = floor(side * side * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println(
            """
            Figure: $name, 
            area: ${calculateArea()} sq. units, 
            side: $side units, 
            color: $color
            """.trimIndent()
        )
    }
}
