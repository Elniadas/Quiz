package com.grupox.game_primeros_test.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [Pregunta::class],
    version = 1
)

abstract class PreguntasDataBase: RoomDatabase() {

        abstract fun getPreguntaDao():PreguntaDao

        companion object{
            @Volatile private var instance  : PreguntasDataBase? = null //hace que sea accesible por todos en cualquier momento

            private val LOCK = Any()

            operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
                instance ?: buildDatabase(context).also {
                    instance=it
                }
            }

            private fun buildDatabase(context: Context) = Room.databaseBuilder(
                context.applicationContext,
                PreguntasDataBase::class.java,
                "preguntasdatabase"
            ).build()

        }


}