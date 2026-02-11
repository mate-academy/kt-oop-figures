package mate.academy.model

class Circle(val radius: Double, color: Color) : Figure(color) {

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${"%.2f".format(getArea())} sq. units, radius: $radius units, color: $color")
    }
}
