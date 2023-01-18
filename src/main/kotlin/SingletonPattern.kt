
/*
* Singleton pattern means a class has only one object.
*/

fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementfbLikes()
    SharingWidget.Display()
}

object SharingWidget {
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementfbLikes() = fbLikes++
    fun Display() {
        println("Facebook Likes - $fbLikes, Twitter Likes - $twitterLikes")
    }
}