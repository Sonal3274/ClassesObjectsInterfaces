/*
* Class and its object created at once.
*/

fun main() {
    println(Abc.num)
    Xyz.test()
}

object Abc {
    val num: Int = 10
}

object Xyz {
    val p: Int = 20
    fun test() {
        println("I am object Xyz")
    }
}
