package mate.academy.model

class Rectangle(
    color: Color = Color.WHITE,
    private val height: Int,
    private val width: Int
) : Figure(color) {

    override fun draw() {
        println(
            """
                Figure: rectangle, area:${calculateArea()}. units, 
                width: $width units, 
                height: $height units, 
                color: $color
            """.trimIndent()
        )
    }

    override fun calculateArea(): Double {
        return (height * width).toDouble()
    }
}
