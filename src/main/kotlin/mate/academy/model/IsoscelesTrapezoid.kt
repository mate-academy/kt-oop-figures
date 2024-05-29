package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    val firstBase: Double,
    val secondBase: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateArea(): Double = (firstBase + secondBase) * height / 2

    override fun draw() = println(
        "Figure: isosceles trapezoid," +
                " area: ${calculateArea()} sq. units," +
                " $firstBase: 7 units," +
                " $secondBase: 5 units," +
                " color: $color"
    )
}
