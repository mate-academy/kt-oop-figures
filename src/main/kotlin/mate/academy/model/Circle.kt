package mate.academy.model

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${area()} sq units, " +
                "radius: $radius units, " +
                "color: $color")
    }
}
