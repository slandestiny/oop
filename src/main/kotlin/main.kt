import data.Comments
import data.Likes
import data.Post
import service.WallService
import java.util.*

fun main() {
    val post = Post(
        id = 0,
        ownerId = 1,
        date = Date(),
        fromId = 1,
        text = "text",
        comments = Comments(),
        likes = Likes(),
    )
    val post1 = Post(
        id = 3,
        ownerId = 1,
        date = Date(),
        fromId = 1,
        text = "text",
        comments = Comments(),
        likes = Likes(),
    )
    val postNew = Post(
        id = 1,
        ownerId = 1,
        date = Date(122, 10, 22),
        fromId = 1,
        text = "blablabla",
        comments = Comments(),
        likes = Likes(),
    )
    val service = WallService()
    service.add(post)
    service.add(post1)
    println(post)
    println(post1)
    println(postNew)
    service.update(postNew)
    println(postNew)

}

