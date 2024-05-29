package mate.academy.model

class Square(color: Color, val side: Double) : Figure(color) {
    override fun draw() = println(
        "Figure: square," +
                " area: ${calculateArea()} sq. units," +
                " side: $side units," +
                " color: $color"
    )

    override fun calculateArea(): Double = side * side
}
