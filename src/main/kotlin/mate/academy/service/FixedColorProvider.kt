package mate.academy.service

import mate.academy.model.Color

class FixedColorProvider(private val color: Color) : ColorProvider {
    override fun getRandomColor(): Color = color
}
