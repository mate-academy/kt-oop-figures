package mate.academy.model

class Rectangle(color: Color, val length: Int, val width: Int) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, length: $length, width: $width, color: $color")
    }
}
