package mate.academy.model

class Rectangle(
    color: Color,
    private val oneSide: Double,
    private val secondSide: Double
) : Figure(color) {
    override fun calculateArea() = oneSide * secondSide


    override fun draw() = "Figure: rectangle, area: ${calculateArea()} sq. units," +
            " oneSide: $oneSide units," +
            " secondSide: $secondSide units," +
            " color: $color"
}
