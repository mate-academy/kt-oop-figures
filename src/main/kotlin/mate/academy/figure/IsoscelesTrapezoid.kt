package mate.academy.figure

import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color,
    private val firstBase: Double,
    private val secondBase: Double,
    private val height: Double) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, "
                + "area: ${getArea()} sq. units, "
                + "firstBase: $firstBase units, "
                + "secondBase: $secondBase units, "
                + "height: $height units, "
                + "color: $colour")
    }

    override fun getArea() = (firstBase + secondBase) / 2 * height
}
