package mate.academy.model

class IsoscelesTrapezoid(
    color: String,
    private val height: Double,
    private val topSide: Double,
    private val bottomSide: Double,
) : Figure(color) {
    override fun getArea(): Double {
        return (height / 2) * (topSide + bottomSide)
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${getArea()}, " +
                    "top side: $topSide, bottom side: $bottomSide, height: $height, " +
                    "color: $color"
        )
    }
}
