package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val baseSide: Double,
    private val topSide: Double,
    private val height: Double
) : Figure(color) {
    override fun calculateArea() = (baseSide + topSide) / 2 * height


    override fun draw() = "Figure: isoscelesTrapezoid, area: ${calculateArea()} sq. units," +
            " baseSide: $baseSide  units," +
            " topSide: $topSide units," +
            " height: $height units," +
            " color:$color)"
}
