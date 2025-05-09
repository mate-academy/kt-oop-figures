package mate.academy.model

class IsoscelesTrapezoid(
    override val color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure {
    override fun area(): Double = ((base1 + base2) / 2) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${area()} sq. units, base1:"
                + " $base1, base2: $base2, height: $height, color: ${color.name.lowercase()}")
    }
}
