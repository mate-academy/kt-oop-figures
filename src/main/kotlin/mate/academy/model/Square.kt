package mate.academy.model

class Square(
    val side: Double,
    color: Color
) : Figure(color) {
    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}
