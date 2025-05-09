package mate.academy.model.model

import mate.academy.supplier.Color
import mate.academy.model.service.AreaCalculator
import mate.academy.model.service.Drawable

abstract class Figure(protected val color: Color): Drawable, AreaCalculator
