package mate.academy.model

class Rectangle(private val width : Double, private val height : Double
, color: Color) : Figure(color) {
    override fun draw() {
        println(
            """
            |Figure: square, area: ${getArea()}. units
            |, width: $width units, height: $height units, color: $color")
            """.trimMargin())
    }

    override fun getArea() : Double {
        return width * height
    }
}
