package mate.academy.model

import mate.academy.model.Color.WHITE
import mate.academy.util.toSingleLine
import kotlin.math.PI

class Circle(
        color: Color = WHITE,
        private val radius: Int = 10
) : Figure(color) {

    override fun getArea() : String = """
        Figure: ${this::class.simpleName}, area: ${"%.1f".format(radius * radius * PI)} sq. units, 
        radius: $radius units, color: ${color.name.lowercase()}
    """.toSingleLine()

}
