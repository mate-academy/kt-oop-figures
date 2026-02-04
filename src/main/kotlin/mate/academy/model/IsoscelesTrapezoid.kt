package mate.academy.model

import mate.academy.service.FigureBehaviour

class IsoscelesTrapezoid(color: Color, val lowerBase: Double,
                         val upperBase: Double, val height: Double) : Figure(color), FigureBehaviour{
    override fun draw() {
        print("Figure: isosceles trapezoid, area:${getArea()} sq. units, "
                + "lower base: $lowerBase units, upper base: $upperBase units, "
                + "height: $height units, color: $color\n")
    }

    override fun getArea(): Double {
        return (lowerBase + upperBase) / 2.0 * height
    }
}
