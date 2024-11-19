package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

class IsoscelesTrapezoid(
    override val color: Color,
    private val upperSide: Double,
    private val downSide: Double,
    private val height: Double
) : Figure {
    override fun calculateArea(): Double {
        return ((upperSide + downSide) / 2) * height
    }

    override fun draw() {
        println(
            "IsoscelesTrapezoid have color $color, upperSide $upperSide, downSide $downSide "
                    + "and height $height"
        )
    }
}