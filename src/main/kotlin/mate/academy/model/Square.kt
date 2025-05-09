package mate.academy.model

import mate.academy.service.ColorProvider

class Square(private val side: Double, colorProvider: ColorProvider) : Figure(colorProvider) {
    override fun area(): Double = side * side
    override fun draw() {
        println("Figure: square, area: ${area()} sq. units, side: $side units, color: $color")
    }
}
