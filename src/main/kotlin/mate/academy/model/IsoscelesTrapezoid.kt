package mate.academy.model

import mate.academy.util.toSingleLine

class IsoscelesTrapezoid(
        color: Color,
        private val firstBase: Int,
        private val secondBase: Int,
        private val height: Int
) : Figure(color) {

    override fun getArea() : String = """
        Figure: ${this::class.simpleName}, area: ${((firstBase + secondBase) / 2.0) * height} sq. units, 
        firstSide: $firstBase units, secondSide: $secondBase units, height: $height units, 
        color: ${color.name.lowercase()}
    """.toSingleLine()

}
