import data.Comments
import data.Likes
import data.Post
import service.WallService
import java.util.*

fun main() {
    val post = Post(
        id = 1,
        ownerId = 1,
        date = Date(),
        fromId = 1,
        text = "text",
        comments = Comments(),
        likes = Likes(),
    )
    val service = WallService()
    service.add(post)
    println(post)
    val postNew = Post(
        id = 1,
        ownerId = 1,
        date = Date(),
        fromId = 1,
        text = "blablabla",
        comments = Comments(),
        likes = Likes(),
    )
    service.update(postNew)
    println(post)

}

