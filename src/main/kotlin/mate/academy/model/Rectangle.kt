package mate.academy.model

class Rectangle(color: Color, private val high: Int, private val width: Int) : Figure(color) {
    override fun draw() = println(getStartMessage() + "high: $high, width: $width")

    override fun calculateArea() = high * width.toDouble()
}