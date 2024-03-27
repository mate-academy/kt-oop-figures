package mate.academy.model

import kotlin.math.pow

private const val POWER = 2.0

class Square(color: Color, val side: Int) : Figure(color) {
    override fun getArea(): Double {
        return side.toDouble().pow(POWER)
    }

    override fun draw() {
        println(
            "Figure: square , area: ${getArea()}sq . units," +
                    " side:$side  units, color: $color"
        )
    }
}
