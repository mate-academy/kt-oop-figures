package mate.academy.model

enum class Color {
    YELLOW,
    BLUE,
    GREEN,
    WHITE,
    BLACK;

    fun getName() = name.lowercase()
}
