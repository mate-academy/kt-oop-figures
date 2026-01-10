package mate.academy.model

class IsoscelesTrapezoid(
    color: Color, val baseA: Double,
    val baseB: Double, val height: Double
) : Figure(color) {
    override fun area(): Double = (baseA + baseB) / 2 * height

    override fun draw() {
        println(
            "Figure: Isosceles Trapezoid, area: ${area().f2()} sq. " +
                    "units, baseA: ${baseA.f2()} units, baseB: ${baseB.f2()} units," +
                    "height: ${height.f2()} color: $color"
        )
    }
}
