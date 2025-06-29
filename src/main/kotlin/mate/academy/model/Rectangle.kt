package mate.academy.model

class Rectangle (val length: Double, val width: Double, val color: Color) : Figure {

    override fun getArea(): Double {
        return length * width
    }

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, length: $length units, color: ${color.name.lowercase()}")
    }
}
