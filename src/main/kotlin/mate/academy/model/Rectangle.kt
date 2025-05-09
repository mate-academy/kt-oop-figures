package mate.academy.model

import mate.academy.service.ColorProvider

class Rectangle(
    private val width: Double,
    private val height: Double,
    colorProvider: ColorProvider)
    :Figure(colorProvider) {
    override fun area(): Double = width * height
    override fun draw() {
        println(
            "Figure: rectangle, area: ${area()} sq. units, width: "
                    + "$width units, height: $height units, color: $color"
        )
    }
}
