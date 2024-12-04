package mate.academy.figures

import mate.academy.model.Color

class IsoscelesTrapezoid(
    color: Color,
    private val bottomBase: Double,
    private val topBase: Double,
    private val height: Double) : Figure(color) {

    override fun getArea(): Double {
        return (bottomBase + topBase) / 2 * height
    }

    override fun print() {
        println("Figure: isoscelesTrapezoid, area: ${getArea()} sq. units," +
                " bottomBase: $bottomBase units," +
                " topBase: $topBase units," +
                " height: $height units," +
                " color: $color")
    }
}
