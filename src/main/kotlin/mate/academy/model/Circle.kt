package mate.academy.model

class Circle(private val color: Color,
             private val radius: Double) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: $color")
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}