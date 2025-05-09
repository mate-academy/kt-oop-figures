package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.FLOOR_NUMBER
import mate.academy.service.HALF_MULTIPLIER
import kotlin.math.floor

class IsoscelesTrapezoid(val base1: Double, val base2: Double, val height: Double, color: Color)
    : Figure("IsoscelesTrapezoid", color) {

    override fun calculateArea(): Double = floor(HALF_MULTIPLIER * (base1 + base2) * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println(
            """
            Figure: $name, 
            area: ${calculateArea()} sq. units, 
            base1: $base1 units, 
            base2: $base2 units, 
            height: $height units, 
            color: $color
            """.trimIndent()
        )
    }
}
