package mate.academy.model

import kotlin.math.sqrt

class Square(private val color: Color, private val side: Double) : Figure(color) {
    private val area = calculateArea()

    override fun calculateArea(): Double {
        return sqrt(side)
    }
    override fun draw() {
        println(
            "Figure: square, area: $area sq. units, "
                    + "side: $side units, "
                    + "color: $color"
        )
    }


}
