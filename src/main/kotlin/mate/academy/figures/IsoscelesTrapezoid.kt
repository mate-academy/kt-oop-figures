package mate.academy.figures

import mate.academy.model.Color

class IsoscelesTrapezoid(
    val median: Int, val height: Int, color: Color, type: String = "isosceles trapezoid")
    : Figure(color, type) {
    override fun area(): Double = height.toDouble() * median

    override fun draw() {
        println("Figure: $type, area: ${area()} sq. units, " +
                "median: $median units, height: $height units, color: $color")
    }
}
