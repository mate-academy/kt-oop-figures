package mate.academy.model

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun area(): Double = Math.PI * radius * radius

    override fun draw() {
        println(
            "Figure: circle, area: ${area().f2()} sq. units, " +
                    "radius: ${radius.f2()} units, color: $color"
        )
    }
}
