package mate.academy.model

class Rectangle(
    private val color: Color,
    private val width: Double,
    private val length: Double
) : Figure(color) {
    override fun calculateArea() = width * length

    override fun draw() {
        println("""Figure: rectangle, area: ${calculateArea()} sq. units,
                width: $width units,
                length: $length units,
                color: $color""")
    }
}
