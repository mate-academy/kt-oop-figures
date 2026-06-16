package mate.academy.model

class IsoscelesTrapezoid(
    override val color: Color,
    private val sideA: Double,
    private val sideB: Double,
    private val height: Double,

) : Figure(color) {
    override fun area(): Double = (sideA + sideB) * height / 2

    override fun draw() {
        println(
        "Figure: isosceles trapezoid, area:  %.2f, sideA:  %.2f, sideB:  %.2f," +
                "height:  %.2f, color: $color".format(area(), sideA, sideB, height))
    }
}
