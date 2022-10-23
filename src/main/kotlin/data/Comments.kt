package data

data class Comments(
    // количество комментариев
    var count: Int = 0,
    // информация о том, может ли текущий пользователь комментировать запись
    var canPost: Boolean = true,
    // информация о том, могут ли сообщества комментировать запись
    var groupsCanPost: Boolean = true,
    // может ли текущий пользователь закрыть комментарии к записи
    var canClose: Boolean = true,
    // может ли текущий пользователь открыть комментарии к записи
    var canOpen: Boolean = true,
)