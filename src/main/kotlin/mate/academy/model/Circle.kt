package mate.academy.model

class Circle(color: String, private val radius: Double) : Figure(color) {
    override fun getArea(): Double {
        return Math.PI * radius * radius;
    }

    override fun draw() {
        println("Figure: circle, area ${getArea()} units, radius: $radius, color: $color")
    }
}
