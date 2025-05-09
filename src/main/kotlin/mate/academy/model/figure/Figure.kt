package mate.academy.model.figure

import mate.academy.model.AreaMeasurable
import mate.academy.model.Color
import mate.academy.model.Drawable

abstract class Figure(protected val color: Color) : Drawable, AreaMeasurable
