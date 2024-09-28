package com.example.todo_app.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    //to insert and update the data set at the same time
    @Upsert
    fun upsertNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM note ORDER BY dateAdded")
    fun getNotesOrderedByDate(): Flow<List<Note>>

    //ASC for ascending order
    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getNotesOrderedByTitle(): Flow<List<Note>>
}