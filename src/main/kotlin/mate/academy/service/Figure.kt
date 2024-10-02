package mate.academy.service

import mate.academy.model.Color

interface Figure {
    val color: Color
    fun getArea(): Double
    fun draw()
}
