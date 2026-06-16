package mate.academy.model

class Rectangle(
    override val color: Color,
    private val width: Double,
    private val height: Double
) : Figure(color) {
    override fun area(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: %.2f, width: %.2f, height: %.2f, color: $color"
            .format(area(), width,  height))
    }
}
