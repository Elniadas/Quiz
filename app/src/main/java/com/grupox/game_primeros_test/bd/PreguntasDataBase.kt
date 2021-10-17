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

abstract class PreguntasDataBase: RoomDatabase() {

        abstract fun getPreguntaDao():PreguntaDao

        companion object{
            @Volatile private var INSTANCE  : PreguntasDataBase? = null //hace que sea accesible por todos en cualquier momento

            fun getDatabase(context: Context):PreguntasDataBase{
                val tempInstance = INSTANCE
                if(tempInstance!=null){
                    return tempInstance
                }
             synchronized(this){
                 val instance = Room.databaseBuilder(
                     context.applicationContext,
                     PreguntasDataBase::class.java,
                     "preguntas_database"
                 ).build()
                 INSTANCE=instance
                 return instance
             }
            }


//            private val LOCK = Any()
//            operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
//                instance ?: buildDatabase(context).also {
//                    instance=it
//                }
//            }
//
//            private fun buildDatabase(context: Context) = Room.databaseBuilder(
//                context.applicationContext,
//                PreguntasDataBase::class.java,
//                "preguntasdatabase"
//            ).build()

        }


}