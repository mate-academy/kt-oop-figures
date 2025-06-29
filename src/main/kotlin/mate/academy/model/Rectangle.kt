package mate.academy.model

class Rectangle(
    val length: Double,
    val width: Double,
    val color: Color
) : Figure {

    override fun getArea(): Double {
        return length * width
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units," +
                    " length: $length units, width: $width units, color: ${color.name.lowercase()}"
        )
    }
}
