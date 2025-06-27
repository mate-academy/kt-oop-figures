package mate.academy.model

class Rectangle(private val firstSide: Int, private val secondSide: Int,
                override val color: Color): Figure {
    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, first side: $firstSide units,"
                    + " second side: $secondSide units, color: $color")
    }

    override fun getArea(): Double {
        return (firstSide * secondSide).toDouble()
    }
}
