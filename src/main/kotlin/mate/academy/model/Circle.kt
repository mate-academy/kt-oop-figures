package mate.academy.model

import kotlin.math.PI

class Circle(
    override val color: Color, private val radius: Double
) : Figure(color) {
    override fun area(): Double = PI * radius * radius

    override fun draw() {
        println(
            "Figure: circle, area: %.2f, radius: %.2f, color: $color".format(area(), radius)
        )
    }
}
