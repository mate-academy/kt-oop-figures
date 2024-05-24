package mate.academy.model

class Rectangle(
    private val color: Color,
    private val width: Double,
    private val length: Double
) : Figure(color) {
    private val area = calculateArea()

    override fun calculateArea(): Double {
        return width * length
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: $area sq. units, "
                    + "width: $width units, "
                    + "length: $length units, "
                    + "color: $color"
        )
    }
}
