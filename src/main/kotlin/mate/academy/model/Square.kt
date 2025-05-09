package mate.academy.model

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return side * side
    }

    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: $color")
    }
}
