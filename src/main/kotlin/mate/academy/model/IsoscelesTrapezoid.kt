package mate.academy.model

private const val MULTIPLIER = 0.5

class IsoscelesTrapezoid(private val base1: Double, private val base2:
Double, private val height: Double, override val color: Color) : Figure {
    override fun area(): Double = MULTIPLIER * (base1 + base2) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${area()} sq. units, base1:" +
                " $base1 units, base2: $base2 units, height: $height units, color: $color")
    }
}
