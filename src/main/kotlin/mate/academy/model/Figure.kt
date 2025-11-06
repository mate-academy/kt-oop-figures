package mate.academy.model

// 🔹 Абстрактний клас — спільна основа для всіх фігур
abstract class Figure(
        val color: Color
) {
    // Усі фігури повинні мати методи для обчислення площі та "малювання"
    abstract fun getArea(): Double
    abstract fun draw()
}

