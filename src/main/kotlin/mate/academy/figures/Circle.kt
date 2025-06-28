package mate.academy.figures

import mate.academy.model.Color
import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, val radius: Int): Figure(color) {
    companion object {
        const val FIGURE_NAME = "circle"
    }

    override fun draw() {
        println("Figure: $FIGURE_NAME, area: ${getArea()} units, " +
                "radius: $radius units, color: $color")
    }

    override fun getArea(): Int {
        return (PI * radius.toDouble().pow(2)).toInt()
    }
}
