package mate.academy.model.figure

import mate.academy.model.enums.Color
import mate.academy.service.interfaces.AreaCalculator
import mate.academy.service.interfaces.Drawable

abstract class Figure(val color: Color) : AreaCalculator, Drawable
