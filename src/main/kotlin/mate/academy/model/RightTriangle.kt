package mate.academy.model

class RightTriangle (color: Color, private val base : Int, private val altitude : Int) : Figure(color){
    override fun behavior (){
        println("Figure: rightTriangle, area: ${base * altitude / 2} sq. units, $base: base, " +
                "$altitude: altitude, color: ${color.name}")
    }
}
