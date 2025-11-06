package mate.academy.model

class Rectangle(
    val width: Double,
    val height: Double,
    color: Color
) : Figure(color) {
    override fun getArea(): Double = width * height

    override fun draw() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, " +
                    "width: $width units, height: $height units, color: $color"
        )
    }
}
