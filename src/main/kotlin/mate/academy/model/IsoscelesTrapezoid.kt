package mate.academy.model

class IsoscelesTrapezoid(
    override val color: Color,
    private val base1: Int,
    private val base2: Int,
    private val height: Int
) : Figure {
    override fun getArea(): Double = (base1 + base2) * height.toDouble() / 2

    override fun draw() {
        println("""
            Figure: isosceles trapezoid, 
            area: ${getArea()} sq. units, 
            base1: $base1 units, 
            base2: $base2 units, 
            height: $height units, 
            color: $color
            """.trimIndent())
    }
}
