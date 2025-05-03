package mate.academy.model

class Circle(private val radius: Double, override val color: Color) : Figure {
    override fun area(): Double = Math.PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${area()} sq. units, radius: $radius units, color: $color")
    }
}
