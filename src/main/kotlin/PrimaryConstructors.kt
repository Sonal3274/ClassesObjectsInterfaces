/*
* Constructors are used to define the default value for the objects.
* This example contains primary constructors.
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

class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirbags: Boolean) {
    var airbags = hasAirbags
}

class Empty

class Person(nameParam: String, ageParam: Int) {
    val name: String = nameParam
    val age: Int = ageParam
}