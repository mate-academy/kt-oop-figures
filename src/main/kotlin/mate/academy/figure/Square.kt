package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color
import kotlin.math.floor

class Square(val side: Double, color: Color) : Figure("square", color), Drawing {

    companion object {
        const val FLOOR_NUMBER = 10.0
    }

    override fun calculateArea(): Double = floor(side * side * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println("Figure: $name, area: ${calculateArea()} sq. units, side: $side units, color: $color")
    }
}
