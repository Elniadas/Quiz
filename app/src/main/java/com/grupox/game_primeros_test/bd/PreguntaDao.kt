package com.grupox.game_primeros_test.bd

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PreguntaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPregunta(pregunta: Pregunta)

    @Query("SELECT * FROM Pregunta")
    fun getAllPreguntas(): LiveData<List<Pregunta>>

    @Query("SELECT * FROM Pregunta")
    fun getAllPreguntasEstatico(): List<Pregunta>


    @Query("SELECT * FROM Pregunta WHERE id= :id")
    suspend fun getPregunta(id: Int): Pregunta

    @Query("SELECT * FROM Pregunta WHERE type= :type")
    fun getAllPreguntasOfType(type: String): LiveData<List<Pregunta>>

    @Insert
    suspend fun addMultplePreguntas(vararg pregunta: Pregunta)

    @Update
    suspend fun update(pregunta: Pregunta)

    @Delete
    suspend fun delete(pregunta: Pregunta)


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addClasificacion(clasificacion: Clasificacion)

    @Query("SELECT * FROM Clasificacion ORDER BY puntuation DESC")
    fun getAllClasificaciones(): LiveData<List<Clasificacion>>

}