package mate.academy.model

class Rectangle(private val width: Double, private val height: Double, override val color: Color) : Figure() {
    override fun calculateArea(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${calculateArea()} sq. units, width: $width units, " +
                "height: $height units, color: $color")
    }
}
