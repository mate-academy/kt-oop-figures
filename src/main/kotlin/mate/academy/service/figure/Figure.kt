package mate.academy.service.figure

import mate.academy.model.Color

interface Figure {
    val color: Color
    fun calculateArea(): Double
    fun draw()
}
