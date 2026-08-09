package mate.academy.model

class Rectangle (
    override val color: Color,
    val length: Double,
    val width: Double
) : Figure {

    override fun getArea(): Double {
        return length * width.toDouble()
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, " +
                    "length: $length units, width: $width units, " +
                    "color: ${color.name.lowercase()}"
        )
    }
}
