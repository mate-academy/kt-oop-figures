package mate.academy.model

class Square(private val side: Double, override val color: Color) : Figure {
    override fun area(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${area()} sq. units, side: $side units, color: $color")
    }
}
