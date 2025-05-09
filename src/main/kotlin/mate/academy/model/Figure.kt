package mate.academy.model

import mate.academy.contract.AreaCalculable
import mate.academy.contract.Drawable

abstract class Figure(val color: Color) : Drawable, AreaCalculable
