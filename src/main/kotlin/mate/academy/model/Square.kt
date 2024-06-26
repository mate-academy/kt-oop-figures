package mate.academy.model

class Square(override val color: Color, private val side: Int) : Figure {
    override fun getArea(): Double = side * side.toDouble()

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}
