package mate.academy.model

class RightTriangle(
    color: Color,
    private val oneSide: Double,
    private val secondSide: Double
) : Figure(color) {
    override fun calculateArea() = (oneSide * secondSide) / 2


    override fun draw() = "Figure: rightTriangle, area: ${calculateArea()} sq. units," +
            " oneSide: $oneSide  units," +
            " secondSide: $secondSide units," +
            " color: $color"
}
