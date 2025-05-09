package mate.academy.service

import mate.academy.model.Color

interface ColorProvider {
    fun getRandomColor(): Color
}
