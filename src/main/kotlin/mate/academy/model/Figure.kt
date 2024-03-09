package mate.academy.model

abstract class Figure(color: Color) : Figural {
    abstract override fun draw()

    abstract override fun calculateArea(): Int

    abstract override fun getDescription(): String
}
