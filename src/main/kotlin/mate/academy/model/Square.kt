package mate.academy.model

class Square(override val color: Color, private val side: Double) : Figure {
    override fun area() = side * side
    override fun draw() = println("Figure: square, area: ${area()} sq. units, side: $side units, color: $color")
}
