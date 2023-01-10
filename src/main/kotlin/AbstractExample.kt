/*
We use abstract class when the body is not defined yet and same for the abstract property.
Abstract properties must be under abstract class.
Abstract class --> Generally a parent class (So the all the child classes created will inherit its properties and
                   provide undefined body)
               --> Can't create an object of abstract class
               --> By default all the abstract methods are open.

Here, fun Display can not be defined as abstract as its body is already defined.
*/


abstract class Shape {
    var name: String = ""
    abstract fun area(): Double
    open fun Display() = println("This is the shape class")
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

fun main() {
    val circle = Circle(4.0)
    println(circle.area())
    circle.Display()
}