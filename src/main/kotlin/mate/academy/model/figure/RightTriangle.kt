package mate.academy.model.figure

import mate.academy.model.Color

class RightTriangle(color : Color, private val cat1 : Double, private val cat2 :Double) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, area: ${calculateArea()} sq. units,"
                + " cat 1: $cat1, cat 2: ${cat2}, color: $color")
    }

    override fun calculateArea(): Double {
        return (cat1 * cat2) / 2
    }
}
