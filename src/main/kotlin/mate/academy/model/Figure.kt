package mate.academy.model

abstract class Figure(val color: Color) {
}

class Circle(color: Color, radius: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}

class Rectangle(color: Color, firstSide: Double, secondSide: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}

class RightTriangle(color: Color, firstLeg: Double, secondLeg: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}

class Square(color: Color, side: Double) : Figure(color), AreaCalculator {
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}

class IsoscelesTrapezoid(color: Color, firstParallel: Double, secondParallel: Double, height: Double) : Figure(color),
    AreaCalculator {
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}