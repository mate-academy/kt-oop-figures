package mate.academy.model.model

import mate.academy.supplier.Color

class Square(
    color: Color,
    private val side: Double
) : Figure(color) {

    override fun draw(): Unit = println(
        "Figure ${
            this::class.simpleName
        }, area: ${calculateArea()} sq. units, side: $side, color: $color"
    )

    override fun calculateArea(): Double {
        return side * side
    }
}
