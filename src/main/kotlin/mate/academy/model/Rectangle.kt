package mate.academy.model

class Rectangle(
    override val color: Color,
    private val side: Int,
    private val height: Int
) : Figure {
    private fun calculateArea(): Double {
        return side * height.toDouble()
    }

    override fun println() {
        val area = calculateArea()
        println("Figure: rectangle, area: $area sq. units, " +
                "side: $side units, height: $height units, color: ${color.name}")
    }
}
