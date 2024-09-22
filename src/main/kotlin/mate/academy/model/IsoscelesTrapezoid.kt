package mate.academy.model

class IsoscelesTrapezoid(private val color: Color,
                         private val height: Double,
                         private val top: Double,
                         private val bottom: Double) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${calculateArea()} sq. units, " +
                "height: $height units, top: $top units, bottom: $bottom units, color: $color")
    }

    override fun calculateArea(): Double {
        return (top + bottom) / 2 * height
    }
}