/*
Lateinit is only used with var type and also it can't be int, boolean or float.
lateinit values must be initialized before you use it.
We use lateinit when we are not sure about the initialization value.
It is not allowed with non-nullable data type(?)
*/
class GFG {

    // Declaring a lateinit variable of Int type
    lateinit var myVariable: String
    fun initializeName() {

        // Check using isInitialized method
        println("Is myVariable initialized? " + this::myVariable.isInitialized)

        // initializing myVariable
        myVariable = "GFG"

        // Check using isInitialized method
        println("Is myVariable initialized? " + this::myVariable.isInitialized)
    }
}

fun main() {

    // Calling method
    GFG().initializeName()
}
