package mate.academy.model

class Rectangle(color: Color,
                private val width: Double,
                private val length: Double): Figure(color) {
    override fun getArea() = width * length

    override fun draw() {
        println("""
                Figure: rectangle, area: ${getArea()} sq. units, 
                width: $width units,
                length: $length units, color: $color
         """.trimIndent())
    }
}
