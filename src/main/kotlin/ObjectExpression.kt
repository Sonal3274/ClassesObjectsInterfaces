/*
* In object expression the object will not have any name.
*/

fun main() {
    var testObj = object {
        val x:Int = 10
        fun method(){
            println("This is an object expression")
        }
    }
    println(testObj.method())
}

