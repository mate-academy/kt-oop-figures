package mate.academy.model

class Rectangle(
    override val color: Color,
    private val firstLeg: Int,
    private val secondLeg: Int
) : Figure {
    override fun getArea(): Double = firstLeg * secondLeg.toDouble()

    override fun draw() {
        println("""
            Figure: rectangle, 
            area: ${getArea()} sq. units, 
            firstLeg: $firstLeg units, 
            secondLeg: $secondLeg units, 
            color: $color""".trimIndent())
    }
}
