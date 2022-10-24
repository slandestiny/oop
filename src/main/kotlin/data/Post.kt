package data

import java.util.*

data class Post(
    // идентификатор записи
    var id: Int,
    // идентификатора владельца стены, на которой размещена запись
    var ownerId: Int,
    // идентификатор автора записи
    val fromId: Int,
    // время публикации
    var date: Date,
    // текст записи
    val text: String,
    // информация о комментариях
    val comments: Comments,
    // информация о лайках
    val likes: Likes,
    // информация о том, может ли текущий пользователь удалить запись
    val candDelete: Boolean = true,
    // информация о том, может ли текущий пользователь редактировать запись
    val canEdit: Boolean = true
)
