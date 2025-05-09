package mate.academy.model

class Square(private val side: Double, override val color: Color) : Figure() {
    override fun calculateArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${calculateArea()} sq. units, side: $side units, color: $color")
    }
}
