/*
In this example, the Document class is delegating the implementation of the print() method to the Printer class.
The Document class still has its own printTitle() method that it implements, but for the print() method it simply
delegates the call to the Printer class.

You can see this by creating an instance of Document, the document object, and calling print() method on it.
It will call the print() method of the Printer class instead of having its own implementation.

This separation of concerns allows you to keep the responsibilities of each class more focused and
makes the code easier to understand and maintain.
*/


interface Printable {
    fun print()
}

class Printer : Printable {
    override fun print() {
        println("I am a printer.")
    }
}

class Document(val title: String, val content: String) : Printable by Printer() {
    fun printTitle() {
        println(title)
    }
}

fun main() {

    val document = Document("My Document", "This is the content of my document.")
    document.printTitle() // prints "My Document"
    document.print() // prints "I am a printer."
}
