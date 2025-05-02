package mate.academy.model

class RightTriangle(color: Color,
                    private val side: Double,
                    private val height: Double): Figure(color) {
    override fun getArea() = side / 2 * height

    override fun draw() {
        println("""
                Figure: right triangle, area: ${getArea()} sq. units, 
                side: $side units, 
                height: $height units, color: $color
        """.trimIndent())
    }
}
