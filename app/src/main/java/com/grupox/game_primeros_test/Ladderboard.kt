package com.grupox.game_primeros_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupox.game_primeros_test.bd.Clasificacion
import com.grupox.game_primeros_test.bd.PreguntaViewModel

class Ladderboard : AppCompatActivity() {

    private lateinit var mClasificacionViewModel: PreguntaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ladderboard)

        val adapter=ListAdapter()


    }
}