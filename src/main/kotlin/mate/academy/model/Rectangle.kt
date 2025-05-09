package mate.academy.model

class Rectangle(
    color: Color,
    private val width: Double,
    private val height: Double
) : Figure(color) {

    override fun getArea(): Double {
        return width * height
    }

    override fun draw() {
        println(
            """
                Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()}
                                     sq. units, height: $height
                                     units, width: $width
                                     color: $color
            """.trimIndent()

        )
    }
}
