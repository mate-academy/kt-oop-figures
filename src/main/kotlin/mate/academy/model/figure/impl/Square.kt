package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import kotlin.math.pow

class Square(override val color: Color, private val side: Double) : Figure {
    override fun calculateArea(): Double {
        return side.pow(2)
    }

    override fun draw() {
        println("Square has color $color and side $side")
    }
}