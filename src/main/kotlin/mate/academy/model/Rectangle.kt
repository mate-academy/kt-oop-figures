package mate.academy.model

class Rectangle(
        color: Color,
        private val width: Double,
        private val height: Double
    ) : Figure (color) {

    override fun getArea(): Double = width * height

    override fun draw(): String = ("Figure: ${javaClass.simpleName.lowercase()}, "
            + "area: ${getArea()} sq. units, "
            + "width: $width units, "
            + "height: $height units, "
            + "color: ${color.toString().lowercase()}"
    )
}
