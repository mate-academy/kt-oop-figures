package mate.academy.model

class RightTriangle(color: Color, val firstLeg: Double,
                             val secondLeg: Double): Figure(color) {

    override fun getArea(): Double {
        return firstLeg * secondLeg / 2
    }

    override fun draw() {
        println(
            "Figure: right triangle, " +
                    "area: ${getArea()} sq. units, " +
                    "firstLeg: $firstLeg units, " +
                    "secondLeg: $secondLeg units, " +
                    "color: ${color.name.lowercase()}"
        )
    }
}
