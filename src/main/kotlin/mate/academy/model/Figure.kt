package mate.academy.model

import mate.academy.service.AreaCalculator
import mate.academy.service.Drawable

sealed class Figure(private val color: Color) : AreaCalculator, Drawable {
}
