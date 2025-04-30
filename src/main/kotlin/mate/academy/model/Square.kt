package mate.academy.model

class Square(
    override val color: Color,
    private val side: Int
) : Figure {
    private fun calculateArea(): Double {
        return side * side.toDouble()
    }

    override fun println() {
        val area = calculateArea()
        println("Figure: square, area: $area sq. units, side: $side units, color: ${color.name}")
    }
}
