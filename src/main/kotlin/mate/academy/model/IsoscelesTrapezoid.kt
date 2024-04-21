package mate.academy.model

class IsoscelesTrapezoid(
    color: Color, private val base: Double, private val top: Double,
    private val height: Double
) : Figure(color) {
    override fun getArea(): Double {
        return (top + base) * height / 2
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${getArea()} sq. units, base: $base units, "
                    + "top: $top units, height: $height units, color: $color"
        )
    }
}
