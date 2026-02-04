package mate.academy.model

import mate.academy.service.FigureBehaviour
import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, val radius: Double) : Figure(color), FigureBehaviour {
    override fun draw() {
        print("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: ${color}\n")
    }

    override fun getArea(): Double {
        return radius.pow(2.0) * PI
    }
}
