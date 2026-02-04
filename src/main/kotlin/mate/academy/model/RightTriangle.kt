package mate.academy.model

import mate.academy.service.FigureBehaviour

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double)
    : Figure(color), FigureBehaviour {
    override fun draw() {
        print("Figure: right triangle, area:${getArea()} sq. units, "
                + "first leg: $firstLeg units, second leg: $secondLeg units, color: $color,\n")
    }

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2.0
    }
}
