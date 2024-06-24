package mate.academy.model

open class Figure(val color: Color) {

    open fun drawFigure(figure: Figure) {}

    open fun getFigureName(figure: Figure): String? {
        fun splitFigureName(name: String): String {
            return name.split("(?=[A-Z])".toRegex())
                .filter { it.isNotEmpty() }
                .joinToString(" ")
        }
        return figure::class.simpleName?.let { splitFigureName(it).lowercase() }
    }

    open fun getColor(figure: Figure): String {
        return figure.color.toString().lowercase()
    }
}
