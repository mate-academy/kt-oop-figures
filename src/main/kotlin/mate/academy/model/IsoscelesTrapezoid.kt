package mate.academy.model

private const val TWO = 2.0

class IsoscelesTrapezoid(private val firstBase: Int, private val secondBase: Int,
                         private val height: Int, override val color: Color): Figure {

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, first base: $firstBase units,"
                + " second base: $secondBase units, height: $height units, color: $color")
    }

    override fun getArea(): Double {
        return (firstBase + secondBase) * height / TWO
    }
}
