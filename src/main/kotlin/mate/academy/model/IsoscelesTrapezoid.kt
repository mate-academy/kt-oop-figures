package mate.academy.model

class IsoscelesTrapezoid(
    private val base1: Double,
    private val base2: Double,
    private val height: Double,
    override val color: Color
) : Figure() {
    override fun calculateArea(): Double = ((base1 + base2) * height) / 2

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, base1: $base1" +
                " units, base2: $base2 units, height: $height units, color: $color")
    }
}
