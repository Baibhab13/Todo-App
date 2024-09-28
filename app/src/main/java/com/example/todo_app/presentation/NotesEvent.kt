package com.example.todo_app.presentation

import com.example.todo_app.Data.Note

sealed interface NotesEvent {
    object SortNote: NotesEvent

    data class DeleteNote(val note: Note): NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent
}