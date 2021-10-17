package com.grupox.game_primeros_test.bd

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PreguntaViewModel(application: Application) : AndroidViewModel(application) {

    val readAllData: LiveData<List<Pregunta>>
    val readAllDataTypeImage: LiveData<List<Pregunta>>
    val readAllDataTypeGif: LiveData<List<Pregunta>>
    val readAllDataTypeFourImages: LiveData<List<Pregunta>>
    val readAllDataTypeVideo: LiveData<List<Pregunta>>
    private val repository: PreguntasRepository

    init {
        val preguntaDao = PreguntasDataBase.getDatabase(application).getPreguntaDao()
        repository = PreguntasRepository(preguntaDao)
        readAllData = repository.readAllData
        readAllDataTypeImage = repository.readAllDataTypeImage
        readAllDataTypeGif = repository.readAllDataTypeGif
        readAllDataTypeFourImages = repository.readAllDataTypeFourImages
        readAllDataTypeVideo = repository.readAllDataTypeVideo
    }

    fun addPregunta(pregunta: Pregunta) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addPregunta(pregunta)
        }
    }



}