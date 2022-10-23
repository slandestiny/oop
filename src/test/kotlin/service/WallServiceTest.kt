package service

import data.Comments
import data.Likes
import data.Post
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test
import java.util.*

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val service = WallService()
        val post = Post(
            id = 1,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text",
            comments = Comments(),
            likes = Likes()
        )
        // act
        val result = service.add(post)
        // assert
        assert(result != null)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(id = 1,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text",
            comments = Comments(),
            likes = Likes()))
        service.add(Post(id = 2,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text2",
            comments = Comments(),
            likes = Likes()))
        service.add(Post(id = 3,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text3",
            comments = Comments(),
            likes = Likes()))
        // создаём информацию об обновлении
        val update = Post(id = 1,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "blablabla",
            comments = Comments(),
            likes = Likes())

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
    @Test
    fun updateNonexisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(id = 1,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text",
            comments = Comments(),
            likes = Likes()))
        service.add(Post(id = 2,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text2",
            comments = Comments(),
            likes = Likes()))
        service.add(Post(id = 3,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "text3",
            comments = Comments(),
            likes = Likes()))
        // создаём информацию об обновлении
        val update = Post(id = 8,
            ownerId = 1,
            fromId = 1,
            date = Date(),
            text = "blablabla",
            comments = Comments(),
            likes = Likes())

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}