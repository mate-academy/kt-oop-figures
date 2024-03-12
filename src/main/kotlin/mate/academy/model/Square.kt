package mate.academy.model

class Square(color: Color, val leg: Double) : Figure(color) {
    override fun area(): Double {
        return leg * leg
    }

    override fun draw() {
        println(
            "Figure: square: area: ${area()} sq units, " +
                    "radius: $leg units, " +
                    "color: $color"
        )
    }
}
