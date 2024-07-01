package mate.academy.model

import kotlin.math.PI

class Circle(color: Color = Color.WHITE, private val radius: Int) : Figure(color) {
    override fun draw() = println(getStartMessage() + "radius: $radius")

    override fun calculateArea() = PI * radius * radius
}