package mate.academy.model

class Square(
    color: Color,
    private val side: Double
) : Figure(color) {
    override fun calculateArea() = side * side


    override fun draw() = "Figure: square, area: ${calculateArea()} sq. units," +
            " side: $side units," +
            " color: $color"
}
