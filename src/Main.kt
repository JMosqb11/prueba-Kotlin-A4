class Song(var title: String, var artist: String, var year: Int)
fun main() {
    val cancion = Song("moon",  "Jhonier", 2024)
    println("${cancion.title}, interpretada por ${cancion.artist}, se lanzó en ${cancion.year}.")
}