package mate.academy.model

class Rectangle(
    color: Color, private val firstSide: Int,
    private val secondSide: Int
) : Figure(color) {
    override fun getArea(): Double {
        return (firstSide * secondSide).toDouble()
    }

    override fun draw() {
        println(
            "Figure: rectangle , area: ${getArea()} sq. units," +
                    " firstSide:$firstSide  units, " +
                    "secondSide:$secondSide units, " +
                    "color: $color"
        )
    }
}

