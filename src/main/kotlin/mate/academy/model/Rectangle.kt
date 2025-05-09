package mate.academy.model

import mate.academy.util.toSingleLine

class Rectangle(
        color: Color,
        private val width: Int,
        private val length: Int
) : Figure(color) {

    override fun getArea() : String = """
        Figure: ${this::class.simpleName}, area: ${width * length} sq. units, 
        width: $width units, length: $length units, color: ${color.name.lowercase()}
    """.toSingleLine()

}
