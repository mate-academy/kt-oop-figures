package mate.academy.model

class Rectangle(color: Color, val leg1: Double, val leg2: Double) : Figure(color) {
    override fun area(): Double {
        return leg1 * leg2
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${area()} sq units, " +
                    "leg1: $leg1 units, " +
                    "leg2: $leg2 units, " +
                    "color: $color"
        )
    }
}
