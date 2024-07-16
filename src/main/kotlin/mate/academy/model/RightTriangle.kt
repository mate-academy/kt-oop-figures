package mate.academy.model

import mate.academy.util.toSingleLine

class RightTriangle(
        color: Color,
        private val firstLeg: Int,
        private val secondLeg: Int
) : Figure(color) {

    override fun getArea() : String = """
        Figure: ${this::class.simpleName}, area: ${(firstLeg * secondLeg) / 2.0} sq. units, 
        firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: ${color.name.lowercase()}
    """.toSingleLine()

}
