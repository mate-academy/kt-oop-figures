package mate.academy.model

private const val HALF = 0.5

class RightTriangle(private val firstLeg: Int, private val secondLeg: Int,
                    override val color: Color): Figure {

    override fun draw() {
        println("Figure: triangle, area: ${getArea()} sq. units, firstLeg: $firstLeg units,"
                + " secondLeg: $secondLeg units, color: $color")
    }

    override fun getArea(): Double {
        return  HALF * firstLeg * secondLeg
    }
}
