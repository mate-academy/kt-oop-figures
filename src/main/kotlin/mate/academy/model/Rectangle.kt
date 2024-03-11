package mate.academy.model

class Rectangle(color: Color,
                val firstSide: Int,
                val secondSide: Int) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, " +
                "firstSide: $firstSide units, secondSide: $secondSide units," +
                " color: $color")
    }

    override fun getArea(): Double {
        return (firstSide * secondSide).toDouble()
    }
}
