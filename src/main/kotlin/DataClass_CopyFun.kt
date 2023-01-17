
fun main() {
    val p1 = People(1, "John")
    val p2 = People(1, "John")

    val p3 = p1.copy()   //Copy function
    println(p3)

    val p4 = p2.copy(id = 4)
    println(p4)

    val(id, name) = p1
    println(id)
    println(name)
    println(p1.component1()) // component1= id
    println(p1.component2()) // component2= name
}

data class People(val id:Int, val name:String){

}