package mate.academy.model

class RightTriangle(
    override val color: Color,
    private val firstLength: Double,
    private val secondLength: Double
) : Figure(color) {
    override fun area(): Double = (firstLength * secondLength) / 2

    override fun draw() {
        println("Figure: right triangle: area: %.2f, " +
                    "firstLength: %.2f, secondLength: %.2f, color: $color"
                        .format(area(), firstLength, secondLength))
    }
}
