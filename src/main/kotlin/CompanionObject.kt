/*
* No need to specify the object name while accessing the properties of the companion object but one class can have only
* one companion object.
*/

fun main() {
MyClass.MyObject.print()
    //MyClass.NewObject.newPrint()
    MyClass.newPrint() //No need to use the object name to access the properties in companion object.
}

class MyClass{
    object MyObject{
        fun print(){
            println("Hello I am print function from MyObject")
        }
    }
   companion object NewObject{ //Companion object
        fun newPrint(){
            println("Hello I am print function from NewObject")
        }
    }
}