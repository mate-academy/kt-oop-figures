package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val bottomBase: Double,
    private val topBase: Double,
    private val height: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return (bottomBase + topBase) * height / 2
    }

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, "
                + "bottomBase: $bottomBase units, topBase: $topBase units, height: $height, color: $color")
    }
}
