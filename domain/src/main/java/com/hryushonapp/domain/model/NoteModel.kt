package com.hryushonapp.domain.model

// базовый тип данных включающий в себя:
// 1 заголовок,
// 2 содержание заметки.

class NoteModel(
    val noteTitle: String,
    val noteContent: String
)