package mate.academy.model

class IsoscelesTrapezoid (
    override val color: Color,
    val base1: Double,
    val base2: Double,
    val height: Double
) : Figure {

    override fun getArea(): Double {
        return (base1 + base2) * height / 2.0
    }

    override fun draw() {
        println(
            "Figure: trapezoid, area: ${getArea()} sq. units, " +
                    "base1: $base1 units, base2: $base2 units, " +
                    "height: $height units, color: ${color.name.lowercase()}"
        )
    }
}
