package com.example.universerickandmorty.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [CharactersEntity::class],
    version = 1,
    exportSchema = true
)
abstract class CharactersDataBase:RoomDatabase() {

    abstract fun charactersDao():ICharactersDao

    companion object {

        private var INSTANCE: CharactersDataBase? = null
        private var LOCK = Any()
        private var DB_NAME = "CharactersDataBase"


        fun getInstance(context: Context): CharactersDataBase {
            INSTANCE?.let { return it }

            synchronized(LOCK) {
                INSTANCE?.let { return it }

                val database = Room.databaseBuilder(
                    context = context,
                    klass = CharactersDataBase::class.java,
                    DB_NAME
                ).createFromAsset("data.db").build()

                INSTANCE = database
                return database
            }
        }
    }
}