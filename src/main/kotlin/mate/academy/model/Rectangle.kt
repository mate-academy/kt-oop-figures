package mate.academy.model

import mate.academy.service.FigureBehaviour

class Rectangle(color: Color, val sideA: Double, val sideB: Double)
    : Figure(color), FigureBehaviour {
    override fun draw() {
        print("Figure: rectangle, area:${getArea()} sq. units, "
                + "side A: $sideA units, side B: $sideB units, color: $color\n")
    }

    override fun getArea(): Double {
        return sideA * sideB
    }
}
