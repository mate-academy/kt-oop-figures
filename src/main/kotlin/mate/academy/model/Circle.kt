package mate.academy.model

class Circle(
    override val color: Color,
    private val radius: Double
) : Figure {
    override fun area(): Double = Math.PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${"%.2f".format(area())} sq. units, radius:"
                + " $radius units, color: ${color.name.lowercase()}")
    }
}
