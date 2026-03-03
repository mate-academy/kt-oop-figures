package mate.academy.model

class Rectangle(val color: Color, val length: Double, val width: Double) : Figure {
    override fun draw() {
        println("Figure: rectangle, length: $length units, " +
                "width: $width units, color: ${color.toString().lowercase()}")
    }
}