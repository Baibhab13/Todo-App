package com.example.todo_app.Data

import androidx.room.Database

@Database(
    entities = [Note::class],
    version = 1
)
class NotesDatabase {
}