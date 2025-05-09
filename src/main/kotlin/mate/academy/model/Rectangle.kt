package mate.academy.model

class Rectangle(
    override val color: Color,
    private val width: Double,
    private val height: Double
) : Figure {
    override fun area(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${area()} sq. units, width:"
                + " $width units, height: $height units, color: ${color.name.lowercase()}")
    }
}
