package mate.academy.model

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun getArea(): Double = Math.PI * radius * radius

    override fun draw() = println("Figure: circle, area: ${getArea()} sq. units,"
            + " radius: $radius units, color: $color")
}
