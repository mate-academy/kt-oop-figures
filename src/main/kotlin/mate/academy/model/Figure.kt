package mate.academy.model

abstract class Figure : Figural {
    abstract override fun draw()

    abstract override fun calculateArea(): Int

    abstract override fun getDescription(): String
}
