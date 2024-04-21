package mate.academy.model

class Rectangle(color: Color, private val length: Double, private val width: Double) : Figure(color) {
    override fun getArea(): Double {
        return length * width
    }

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, length: $length units, "
                + "width: $width units, color: $color")
    }
}
