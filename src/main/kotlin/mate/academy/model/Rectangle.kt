package mate.academy.model

class Rectangle(color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun getArea(): Double = width * height
}
