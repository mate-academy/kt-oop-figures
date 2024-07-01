package mate.academy.model

class Square(color: Color, private val side: Int) : Figure(color) {
    override fun draw() = println(getStartMessage() + "side: $side")

    override fun calculateArea() = side * side.toDouble()
}