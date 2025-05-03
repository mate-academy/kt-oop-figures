package mate.academy.model

class RightTriangle (private val leg1 : Double, private val leg2 : Double
, color: Color) : Figure(color) {
    override fun draw() {
        println(
            """
            |Figure: square, area: ${getArea()}. units
            |, leg1: $leg1 units, leg2: $leg2 units, color: $color")
            """.trimMargin())
    }

    override fun getArea(): Double = leg1 * leg2 / 2
}
