package com.hryushonapp.fastnotes.domain

interface NoteRepository {
    // через этот интерфейс слой даты будет имплементировать себе функции по работе с хранилищем

    fun deleteNote()
    fun editNote()
    fun loadNote()
    fun saveNote()
}