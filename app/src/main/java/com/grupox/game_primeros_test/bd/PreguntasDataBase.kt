package com.grupox.game_primeros_test.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [Pregunta::class],
    version = 1,
    exportSchema = false
)

abstract class PreguntasDataBase : RoomDatabase() {

    abstract fun getPreguntaDao(): PreguntaDao

    companion object {
        @Volatile
        private var INSTANCE: PreguntasDataBase? = null

        fun getDatabase(context: Context): PreguntasDataBase =
            INSTANCE ?: synchronized(this) {
                INSTANCE
                    ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                PreguntasDataBase::class.java, "preguntas_database"
            ).createFromAsset("database/preguntas_database.db").build()
    }
}


