package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import kotlin.math.pow

class Circle(override val color: Color, private val radius: Double) : Figure {
    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2)
    }

    override fun draw() {
        println("Circle have color $color and radius $radius")
    }
}