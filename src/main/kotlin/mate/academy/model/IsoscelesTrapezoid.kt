package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure(color) {
    override fun getArea(): Double = (base1 + base2) / 2 * height

    override fun draw() {
        println("Figure: trapezoid, area: ${getArea()} sq. units, base1: $base1 units, base2: $base2 units, height: $height units, color: $color")
    }
}