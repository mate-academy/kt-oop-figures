package mate.academy.model

class IsoscelesTrapezoid(
    private val color: Color, private val height: Double, private val middleLine: Double
) : Figure(color) {
    override fun calculateArea() = middleLine * height

    override fun draw() {
        println("""Figure: isosceles trapezoid, area: ${calculateArea()} sq. units,
               height: $height units,
               middleLine: $middleLine units,
               color: $color""")
    }
}
