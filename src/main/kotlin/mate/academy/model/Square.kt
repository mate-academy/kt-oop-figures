package mate.academy.model

class Square(
    override val color: Color,
    private val side: Double
) : Figure(color) {
    override fun area(): Double = side * side

    override fun draw() {
        println("Figure: square, area: %.2f, side: %.2f, color: $color"
            .format(area(), side))
    }
}
