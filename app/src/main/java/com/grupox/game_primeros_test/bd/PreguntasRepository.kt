package com.grupox.game_primeros_test.bd

import androidx.lifecycle.LiveData

class PreguntasRepository(private val preguntaDao: PreguntaDao) {

    val readAllData: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntas()
    val readAllClasificaciones: LiveData<List<Clasificacion>> = preguntaDao.getAllClasificaciones()
    val readAllDataTypeImage: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntasOfType("Image")
    val readAllDataTypeGif: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntasOfType("Gif")
    val readAllDataTypeFourImages: LiveData<List<Pregunta>> =
        preguntaDao.getAllPreguntasOfType("FourImage")
    val readAllDataTypeVideo: LiveData<List<Pregunta>> = preguntaDao.getAllPreguntasOfType("Video")

    suspend fun addPregunta(pregunta: Pregunta) {
        preguntaDao.addPregunta(pregunta)
    }

    suspend fun addClasificacion(clasificacion: Clasificacion) {
        preguntaDao.addClasificacion(clasificacion)
    }


    suspend fun addPreguntasList(vararg pr:Pregunta){
        preguntaDao.addMultplePreguntas(*pr)
    }


}