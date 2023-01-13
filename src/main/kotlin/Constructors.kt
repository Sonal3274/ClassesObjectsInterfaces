import java.sql.Driver

/*
* Constructors are used to define the default value for the objects.
* This example contains primary constructors, secondary constructors and init block.
*/

fun main() {
    var car = Automobile("Car", 4, 5, true)
    println(car.airbags)
    println(car.tyres)
    println(car.maxSeating)


    var Person = Person("A", 20)
    println(Person.name)
    println(Person.age)
}

class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirbags: Boolean) { // These are primary constructors.
    var airbags = hasAirbags
}

class Empty

class Person(nameParam: String, ageParam: Int) { // These are secondary constructors.
    val name: String = "$nameParam - Clan"
    val age: Int = ageParam
}