/*
* Public --> Visible everywhere and if we declare a class or a property then it's public by default.
* Internal --> acts like public but visible only in the same module
* Protected --> Available only in subclasses
* Private --> Visible in the class
*/

fun main() {
    val objA = A()
    val objB = B()

    objB.test()
}

open class A{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40
}

class B:A(){
    fun test(){
        println(p)
        println(q)
        println(r)
        println(s)
    }
}