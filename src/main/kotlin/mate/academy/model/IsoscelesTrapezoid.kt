package mate.academy.model

class IsoscelesTrapezoid(color: Color,
                         private val side1: Double,
                         private val side2: Double,
                         private val height: Double): Figure(color) {
    override fun getArea() = (side1 + side2) / 2 * height

    override fun draw() {
        println("""
            Figure: isosceles trapezoid,
            area: ${getArea()} sq. units,
            side1: $side1 units
            side2: $side2 units
            height: $height units
            color: $color
        """.trimIndent())
    }
}
