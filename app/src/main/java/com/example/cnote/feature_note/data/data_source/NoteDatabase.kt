package com.example.cnote.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cnote.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao //room will do the rest

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}