package mate.academy.model

class Rectangle(color: Color, private val width: Double,
                private val height: Double) : Figure(color) {
    override fun getArea(): Double = width * height
}
