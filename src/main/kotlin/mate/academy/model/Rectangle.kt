package mate.academy.model

class Rectangle(
    color: Color,
    private val length: Double,
    private val width: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun draw() {
        println("Figure: rectangle, area: ${calculateArea()} sq. units, "
                + "length: $length units, width: $width units, color: $color")
    }
}
