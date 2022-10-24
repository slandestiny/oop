package service

import data.Post

class WallService {
    private var posts = emptyArray<Post>()

    // создание записи
    fun add(post: Post): Post {
        if (posts.size == 0) post.id = 1
        else post.id = posts[posts.size - 1].id + 1
        posts += post
        return posts.last()
    }

    // обновление записи
    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (post.id == value.id) {
                posts[index] = post.copy()
               post.ownerId = value.ownerId
               post.date = value.date
                return true
            }
        }
        return false
    }
}