/* This is the example for the use of object expression (how the object expression can be used?).
*
* You can write body of clone methods in the main function.
*/

fun main() {
    var obj = object:Clonable{
        override fun clone() {
            println("I am clone")
        }
    }
    obj.clone()
}

interface Clonable {
    fun clone()
}