package com.grupox.game_primeros_test

import android.content.Context

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.media.AudioManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import java.util.*
import kotlinx.android.synthetic.main.activity_audio_screen.*

class AudioScreen : AppCompatActivity() {

    var audioManager: AudioManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_screen)

        // Get the audio manager system service
         audioManager= getSystemService(AUDIO_SERVICE) as AudioManager



    }
}

