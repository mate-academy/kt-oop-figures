package mate.academy.model

class Rectangle(private val length: Double, private val width: Double, override val color: Color) : Figure {
    override fun area(): Double = length * width

    override fun draw() {
        println("Figure: rectangle, area: ${area()} sq. units, length: $length units," +
                " width: $width units, color: $color")
    }
}
