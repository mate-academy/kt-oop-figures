package mate.academy.model

class Square (
    override val color: Color,
    val side: Double
) : Figure {

    override fun getArea(): Double {
        return side * side.toDouble()
    }

    override fun draw() {
        println(
            "Figure: square, area: ${getArea()} sq. units, " +
                    "side: $side units, color: ${color.name.lowercase()}"
        )
    }
}
