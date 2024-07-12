package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color
import kotlin.math.floor

class Rectangle(val width: Double, val height: Double, color: Color) : Figure("rectangle", color), Drawing {

    companion object {
        const val FLOOR_NUMBER = 10.0
    }

    override fun calculateArea(): Double = floor(width * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println("Figure: $name, area: ${calculateArea()} sq. units,"
                + " width: $width units, height: $height units, color: $color")
    }
}
