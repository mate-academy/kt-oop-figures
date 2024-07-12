package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color
import kotlin.math.PI
import kotlin.math.floor

class Circle(val radius: Double, color: Color) : Figure("circle", color), Drawing {

    private companion object {
        private const val FLOOR_NUMBER = 10.0
    }

    override fun calculateArea(): Double = floor( PI * radius * radius * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println("Figure: $name, area: ${calculateArea()} sq. units, radius: $radius units, color: $color")
    }
}
