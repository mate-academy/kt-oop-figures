package mate.academy.model

class RightTriangle(
        color: Color,
        private val firstLeg: Int,
        private val secondLeg: Int
) : Figure(color) {

    override fun getArea(): String {
        return "Figure: ${this::class.simpleName}, area: ${(firstLeg * secondLeg) / 2.0} sq. units, " +
                "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: ${color.name.lowercase()}"
    }

}
