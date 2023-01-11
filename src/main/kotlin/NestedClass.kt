fun main() {

    val obj =Outer()
     obj.i

    val nested =  Outer.Nested() // Nested class object
    nested.test()

    val innerObj = Outer().Inner() //Inner class object
    innerObj.inner()
}

class Outer {
    var i = 0

    class Nested {
        fun test() {
            println("I am in nested class")
        }
    }

    inner class Inner {
        fun inner(){
            println("I am in inner class")
        }
    }
}