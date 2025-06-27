package mate.academy.model

private const val PI = 3.14

class Circle(private val radius: Int, override val color: Color): Figure {
    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}
