package mate.academy.model

class Rectangle(color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double = width * height

    override fun draw() {
        println(
            "Figure: rectangle, area: ${area().f2()} sq. units, width: ${width.f2()} units, " +
                    "height: ${height.f2()} units color: $color "
        )
    }
}
