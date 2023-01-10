open class OpenModifier {
    open val salary: Int = 1000
    open fun display(){
        println("This is Open Modifier class")
    }
}

class OpenModifierSubClass : OpenModifier(){
    override val salary: Int = 100000
    override fun display() {
        println("This is the subclass")
    }
}

fun main() {
    val obj = OpenModifierSubClass()
    println("Salary = ${obj.salary}")
    obj.display()
}