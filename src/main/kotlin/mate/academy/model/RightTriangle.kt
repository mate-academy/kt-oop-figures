package mate.academy.model

class RightTriangle(color: Color, private val firstLeg: Int, private val secondLeg: Int) : Figure(color) {
    override fun draw() = println(getStartMessage() + "firstLeg: $firstLeg, secondLeg: $secondLeg")

    override fun calculateArea() = firstLeg * secondLeg / 2.0
}
