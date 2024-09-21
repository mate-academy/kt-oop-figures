package mate.academy.model

private const val MULTIPLIER = 0.5

class IsoscelesTrapezoid(val color: String, val baseSide: Double, val height: Double): Figure(color) {
    override fun getArea(): Double {
        return MULTIPLIER * baseSide * height
    }

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()}.sq units, base side: $baseSide, height: $height, color: $color")
    }
}