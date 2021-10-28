package com.grupox.game_primeros_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.grupox.game_primeros_test.bd.Clasificacion
import com.grupox.game_primeros_test.bd.PreguntaViewModel
import kotlinx.android.synthetic.main.activity_ladderboard.*

class Ladderboard : Audio() {

    private lateinit var mClasificacionViewModel: PreguntaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ladderboard)
        setBgUser()
        back_leaderboard_button.setOnClickListener {
            onBackPressed()
        }
        // Recyclerview
        val adapter = ListAdapter()
        val recyclerView = recyclerview
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setBackgroundResource(R.drawable.estilo_texto_enunciado)

        // UserViewModel
        mClasificacionViewModel = ViewModelProvider(this).get(PreguntaViewModel::class.java)
        mClasificacionViewModel.readAllClasificaiones.observe(this, { clasificacion ->
            adapter.setData(clasificacion)
        })


    }

    private fun setBgUser() {
        leaderboard_bg.setImageResource(
            resources.getIdentifier(
                Constants.newBackGround,
                "drawable",
                packageName
            )
        )
    }
}