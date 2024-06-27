package mate.academy.model

const val REGEX_VALUE = "(?=[A-Z])"

open class Figure(
    val color: Color
) {

    open fun drawFigure(figure: Figure) {}

    open fun getFigureName(figure: Figure): String? {
        fun splitFigureName(name: String): String {
            return name.split(REGEX_VALUE.toRegex())
                .filter { it.isNotEmpty() }
                .joinToString(" ")
        }
        return figure::class.simpleName?.let { splitFigureName(it).lowercase() }
    }

    open fun getColor(figure: Figure): String = figure.color.toString().lowercase()

}
