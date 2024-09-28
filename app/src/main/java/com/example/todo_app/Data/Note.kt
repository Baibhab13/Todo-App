package com.example.todo_app.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    val Title: String,
    val description: String,
    val dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int=0
)