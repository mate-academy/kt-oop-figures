package mate.academy.model

class Square(color: Color, private val side: Int) : Figure(color)  {
    override fun draw(): String {
        return "Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color"
    }

    override fun getArea(): Double {
        return (side * side).toDouble()
    }
}