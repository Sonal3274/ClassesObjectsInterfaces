/* Here we have secondary constructors and init block.
* Initializer block is created to execute the set of statements.
*
* In Kotlin, if we create a secondary constructor then it's mandatory to call the primary constructor.
* */

fun main() {
var car1 = Vehicle("Car1", "Petrol")
    println(car1.tyres)
    println(car1.maxSeating)
    println()

var car2 = Vehicle("Car2", "Petrol")
    println(car2.engineType)

}


class Vehicle(val name:String, val tyres:Int, val maxSeating:Int, val engineType:String){

    init {
        println("$name is created")
    }

    init {
        println("2nd initializer block created")
    }

    constructor(nameParam: String, engineParam:String) :
            this(nameParam, 4,5,engineParam)
}