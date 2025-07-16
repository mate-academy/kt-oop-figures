package mate.academy.model

class IsoscelesTrapezoid(
    override val color: Color,
    private val side1 : Double,
    private val side2 : Double,
    private val height : Double
) : Figure {
    override fun area(): Double = ((side1 + side2)  / TWO) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${area()} sq. units, "
                + "side1: $side1 units, side2: $side2 units,"
                + "height: $height units, color: $color")
    }
}
