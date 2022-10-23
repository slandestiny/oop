package service

import data.Post

class WallService {
    private var posts = emptyArray<Post>()

    // создание записи
    fun add(post: Post): Post {
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id)
                return posts.last()
        }
        posts += post
        return posts.last()
    }

    // обновление записи
    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id) {
                value.text = post.text
                value.comments = post.comments
                value.likes = post.likes
                value.candDelete = post.candDelete
                value.canEdit = post.canEdit
                return true
            }
        }
        return false
    }
}