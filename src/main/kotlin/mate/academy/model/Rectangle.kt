package mate.academy.model

class Rectangle(color: Color, private val height: Double, private val width: Double) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${calculateArea()} sq. units, " +
                "height: $height units, width: $width units, color: $color")
    }

    override fun calculateArea(): Double {
        return height * width
    }
}
