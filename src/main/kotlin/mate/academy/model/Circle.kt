package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure(color) {
    private val pi: Double = 3.14

    override fun getArea(): Double {
        return pi * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}
