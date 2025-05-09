package mate.academy.model

import kotlin.math.sqrt

private const val TWO = 2

private const val THREE = 3.0

private const val FOUR = 4

class RightTriangle(val color: String, val side: Double): Figure(color) {
    override fun getArea(): Double {
        return (side * TWO * sqrt(THREE)) / FOUR
    }

    override fun draw() {
        println("Figure: right triangle, area: ${getArea()}.sq units, side: $side, color: $color")
    }
}
