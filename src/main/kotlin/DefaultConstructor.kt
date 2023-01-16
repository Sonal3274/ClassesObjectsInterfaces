/*
* In Kotlin, when no constructor is defined then by default it adds a constructor default constructor.
* The default constructor is always parameterless.
*/
fun main() {
    val ob = Calculator()
    println(ob.add(3,4))
    println(ob.mult(3,4))
}

class Calculator{

    fun add(a:Int, b:Int):Int{
        return a+b
    }
    fun mult(a:Int, b:Int):Int{
        return a*b
    }
}