package mate.academy.model.figure

import mate.academy.model.Color

class IsoscelesTrapezoid(color : Color, private val biggestBase : Double,
                         private val smallestBase : Double, private val high : Double) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${calculateArea()} sq. units,"
                + " biggest base : $biggestBase, smallest base: ${smallestBase}, high: $high color: $color")
    }

    override fun calculateArea(): Double {
        return ((smallestBase + biggestBase) / 2) * high
    }
}
