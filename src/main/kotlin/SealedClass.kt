fun main() {
    val tile: Tile = Red("Mushroom", 25)
    val points: Int = when (tile) {
        is Blue -> tile.points * 5
        is Red -> tile.points * 2
    }
    println(points)
}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()
