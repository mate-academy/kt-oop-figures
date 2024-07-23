package mate.academy.figure

import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color,
    private val height: Double,
    private val lowerBase: Double,
    private val upperBase: Double) : Figure(color) {
    override fun draw() {
        println(
            "Figure: Isosceles Trapezoid, area: ${getArea()} sq. units, "
                    + "height: $height units, "
                    + "bottomBase: $lowerBase units, "
                    + "topBase: $upperBase units, "
                    + "color: $color"
        )
    }

    override fun getArea(): Double {
        return (lowerBase + upperBase) / 2 * height
    }
}
