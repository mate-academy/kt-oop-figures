package mate.academy.model

import mate.academy.service.ColorProvider

abstract class Figure(private val colorProvider: ColorProvider) {

    val color: Color = colorProvider.getRandomColor()
    abstract fun area(): Double
    abstract fun draw()
}
