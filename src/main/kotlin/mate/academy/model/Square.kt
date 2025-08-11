package mate.academy.model

class Square(color: Color = Color.WHITE, private val leg: Int) : Figure(color) {

    override fun draw() {
        println(
            """
                Figure: square, area:${calculateArea()}. units, 
                leg: $leg units, color: $color
            """.trimIndent()
        )
    }

    override fun calculateArea(): Double {
        return (leg * leg).toDouble()
    }
}
