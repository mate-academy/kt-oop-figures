package mate.academy.model

class Square(
    color: Color
    private val side: Double
): Figure(color) {
    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. inits, " +
                "side: $side units, color: $color")
    }
}
