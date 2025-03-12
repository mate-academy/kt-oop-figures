package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val base1: Double,
    private val base2: Double,
    private val height: Double
) : Figure(color) {
    override fun draw(): String {
        return "Figure: isosceles trapezoid, area: ${getArea()} sq. units, base1: $base1 units, base2: $base2 units, height: $height units, color: $color"
    }

    override fun getArea(): Double {
        return ((base1 + base2) / 2) * height
    }

}
