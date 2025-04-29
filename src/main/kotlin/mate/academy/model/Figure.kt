package mate.academy.model

import mate.academy.`interface`.AreaCalculator
import mate.academy.`interface`.Drawable

sealed class Figure(val color : String) : AreaCalculator, Drawable {
}
