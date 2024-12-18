package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun getArea(): Double = Math.PI * radius * radius
}
