package mate.academy.model

class Square(private val color: Color, private val side: Double) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: $color")
    }

    override fun calculateArea(): Double {
        return side * side
    }
}