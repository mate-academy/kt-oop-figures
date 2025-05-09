package mate.academy.model

import mate.academy.util.toSingleLine

class Square(
        color: Color,
        private val side: Int
) : Figure(color) {

    override fun getArea() : String = """
        Figure: ${this::class.simpleName}, area: ${side * side} sq. units, side: $side units, 
        color: ${color.name.lowercase()}
    """.toSingleLine()

}
