package mate.academy.model

class Rectangle(
    color: Color,
    private val oneSide: Double,
    private val secondSide: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return oneSide * secondSide
    }

    override fun draw(): String {
        return "Figure: rectangle, area: ${calculateArea()} sq. units," +
                " oneSide: $oneSide units," +
                " secondSide: $secondSide units," +
                " color: $color"
    }
}
