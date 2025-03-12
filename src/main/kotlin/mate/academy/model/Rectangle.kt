package mate.academy.model

class Rectangle(color: Color, private val firstSide: Int, private val secondSide: Int)
    : Figure(color) {
    override fun draw(): String {
        return "Figure: square, area: ${getArea()} sq. units, first side: $firstSide units, second side: $secondSide units, color: $color"
    }

    override fun getArea(): Double {
        return (firstSide * secondSide).toDouble()
    }
}