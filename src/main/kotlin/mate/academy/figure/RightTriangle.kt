package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color
import kotlin.math.floor

class RightTriangle(val base: Double, val height: Double, color: Color) : Figure("rightTriangle", color), Drawing {

    companion object {
        const val MULTIPLIER = 0.5
        const val FLOOR_NUMBER = 10.0
    }

    override fun calculateArea(): Double = floor(MULTIPLIER * base * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println("Figure: $name, area: ${calculateArea()} sq. units, base: $base units, height: $height units, color: $color")
    }
}
