package com.grupox.game_primeros_test.bd

import androidx.room.*

@Dao
interface PreguntaDao {

    @Insert
    fun addPregunta(pregunta:Pregunta)

    @Query("SELECT * FROM Pregunta")
    fun getAllPreguntas():List<Pregunta>

    @Query("SELECT * FROM Pregunta WHERE id= :id")
    fun getPregunta(id:Int):Pregunta

    @Insert
    fun addMultplePreguntas(vararg pregunta: Pregunta)

    @Update
    fun update(pregunta:Pregunta)

    @Delete
    fun delete(pregunta: Pregunta)

}