package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val baseSide: Double,
    private val topSide: Double,
    private val height: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return (baseSide + topSide) / 2 * height
    }

    override fun draw(): String {
        return "Figure: isoscelesTrapezoid, area: ${calculateArea()} sq. units," +
                " baseSide: $baseSide  units," +
                " topSide: $topSide units," +
                " height: $height units," +
                " color:$color)"
    }
}
