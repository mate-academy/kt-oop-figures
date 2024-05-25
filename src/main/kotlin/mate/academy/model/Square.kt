package mate.academy.model

import kotlin.math.sqrt

class Square(private val color: Color, private val side: Double) : Figure(color) {
    override fun calculateArea() = sqrt(side)

    override fun draw() {
        println("""Figure: square, area: ${calculateArea()} sq. units,
                side: $side units,
                color: $color""")
    }
}
