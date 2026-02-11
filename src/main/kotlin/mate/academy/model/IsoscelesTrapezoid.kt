package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    val baseA: Double,
    val baseB: Double,
    val height: Double
) : Figure(color) {
    override fun getArea(): Double = (baseA + baseB) / 2 * height

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${"%.1f".format(getArea())} sq. units, " +
                    "baseA: ${"%.1f".format(baseA)} units, " +
                    "baseB: ${"%.1f".format(baseB)} units, " +
                    "height: ${"%.1f".format(height)} units, color: $color"
        )
    }
}
