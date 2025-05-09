package mate.academy.model

import mate.academy.service.ColorProvider

class Circle(
    private val radius: Double,
    colorProvider: ColorProvider
) : Figure(colorProvider) {
    override fun area(): Double = Math.PI * radius * radius
    override fun draw() {
        println("Drawing a $color circle with radius $radius")
    }
}
