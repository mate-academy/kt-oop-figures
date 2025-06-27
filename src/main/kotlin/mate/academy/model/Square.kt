package mate.academy.model

class Square(private val side: Int, override val color: Color) : Figure {

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }

    override fun getArea(): Double {
       return (side * side).toDouble()
    }
}
