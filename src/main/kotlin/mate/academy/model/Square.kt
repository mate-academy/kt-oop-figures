package mate.academy.model

import mate.academy.service.FigureBehaviour
import kotlin.math.pow

class Square(color: Color, val side: Double) : Figure(color), FigureBehaviour {
    override fun draw() {
        print("Figure: square, area:${getArea()} sq. units, side length: $side units, color: $color,\n")
    }

    override fun getArea(): Double {
        return side.pow(2.0)
    }
}
