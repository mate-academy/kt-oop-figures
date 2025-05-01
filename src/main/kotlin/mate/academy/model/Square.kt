package mate.academy.model

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun getArea(): Double = side * side
}
