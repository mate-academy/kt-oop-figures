package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure(color) {
    override fun area(): Double = 0.5 * (base1 + base2) * height

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${area()} sq. units, " +
            "base1: $base1 units, base2: $base2 units, height: $height units, color: $color"
        )
    }
}
