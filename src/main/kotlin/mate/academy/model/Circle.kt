package mate.academy.model

const val PI: Double = 3.14

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun getArea(): Double {
        return PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}
