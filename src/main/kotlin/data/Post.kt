package data

import java.util.*

data class Post(
    // уникальный идентификатор записи
    private val uniqueId: UUID = UUID.randomUUID(),
    // идентификатор записи
    val id: Int,
    // идентификатора владельца стены, на которой размещена запись
    val ownerId: Int,
    // идентификатор автора записи
    val fromId: Int,
    // время публикации
    val date: Date,
    // текст записи
    var text: String,
    // информация о комментариях
    var comments: Comments,
    // информация о лайках
    var likes: Likes,
    // информация о том, может ли текущий пользователь удалить запись
    var candDelete: Boolean = true,
    // информация о том, может ли текущий пользователь редактировать запись
    var canEdit: Boolean = true
)
private val iniqueId: Int = 0