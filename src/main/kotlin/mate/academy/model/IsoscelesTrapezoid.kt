package mate.academy.model

class IsoscelesTrapezoid(
    private val color: Color,
    private val height: Double,
    private val middleLine: Double
) : Figure(color) {
    private val area = calculateArea()

    override fun calculateArea(): Double {
        return middleLine * height
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: $area sq. units, "
                    + "height: $height units, "
                    + "middleLine: $middleLine units, "
                    + "color: $color"
        )
    }
}
