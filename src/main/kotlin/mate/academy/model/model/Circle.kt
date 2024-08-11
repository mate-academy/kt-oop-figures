package mate.academy.model.model

import mate.academy.supplier.Color

class Circle(
    color: Color,
    private val radius: Double
) : Figure(color) {

    override fun draw(): Unit = println(
        "Figure ${
            this::class.simpleName
        }, area: $radius color: $color"
    )

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
