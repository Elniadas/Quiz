package com.grupox.game_primeros_test.bd

import androidx.lifecycle.LiveData

class PreguntasRepository(private val preguntaDao: PreguntaDao) {

    val readAllData: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntas()

    val readAllDataTypeImage: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntasOfType("Image")
    val readAllDataTypeGif: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntasOfType("Gif")
    val readAllDataTypeFourImages: LiveData<List<Pregunta>> =
        preguntaDao.getAllPreguntasOfType("FourImage")


    suspend fun addPregunta(pregunta: Pregunta) {
        preguntaDao.addPregunta(pregunta)
    }

    suspend fun addPreguntasList(vararg pr:Pregunta){
        preguntaDao.addMultplePreguntas(*pr)
    }


}