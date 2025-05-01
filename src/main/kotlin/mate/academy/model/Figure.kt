package mate.academy.model

import mate.academy.service.Drawable

open class Figure(val color: Color) : Drawable {
    override fun draw() {
        println("Figure: ${this.javaClass.name.lowercase()}, color: $color")
    }
}
