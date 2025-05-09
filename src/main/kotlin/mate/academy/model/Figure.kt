package mate.academy.model

import mate.academy.interfaces.AreaCalculator
import mate.academy.interfaces.Drawable

sealed class Figure(val color: String) : AreaCalculator, Drawable
