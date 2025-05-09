package mate.academy.model

class Square(color: Color, private val side: Double) : Figure (color) {

    override fun getArea(): Double = side * side

    override fun draw(): String = "Figure: ${javaClass.simpleName.lowercase()}, " +
        "area: ${getArea()} sq. units, side: $side units, color: ${color.toString().lowercase()}"
}
