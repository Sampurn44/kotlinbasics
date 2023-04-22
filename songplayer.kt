fun main() {    
    val newsong = Song("wahan Kaun Hai Tera", "S.D.Burman", 1965, 6_596_658)
    newsong.printDescription()
    println(newsong.isPopular)
}


class Song(
    val title: String, 
    val artist: String, 
    val yearPublished: Int, 
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }   
}
