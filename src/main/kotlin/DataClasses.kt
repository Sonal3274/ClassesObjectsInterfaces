/*
* data classes are used to avoid writing same code again n again.
* Also, if we have to use getters and setters for almost every property of the class then we can use data classes.
*/
fun main() {

    val p1 = Persons(1, "John")
    val p2 = Persons(1, "John")

    println(p1)//toString
    println(p2)
    println(p1.hashCode())
    println(p1 == p2) //p1.equals(p2)
}

data class Persons(val id: Int, val name: String) {

}
