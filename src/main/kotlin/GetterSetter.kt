fun main() {
    val p1 = Person1("gettersetter", 21)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    println(p1.name)

}

class Person1(nameParam:String, ageParam:Int){
    var name:String = nameParam
        get() {
            return field.toUpperCase()
        }
    var age:Int = ageParam
        set(value) {
            if (value>0){
                field = value
            }
            else{
                println("Age can't be negative")
            }

        }
}