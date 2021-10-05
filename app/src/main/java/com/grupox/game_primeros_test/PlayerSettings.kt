package com.grupox.game_primeros_test

import android.content.Context
import android.content.Context.AUDIO_SERVICE
import android.media.AudioManager
import android.media.MediaPlayer
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService


object PlayerSettings {
    var player: MediaPlayer? = null
    var played: Boolean = false
    var nQuestions: Int = 5
    var rightQuestions: Int = 0
    var appStart = true
    var questAnswered = false
    var buttonSoundPlayer: MediaPlayer? = null

    fun startMusic(context: Context) {
        if (player == null) {

            player = MediaPlayer.create(context, R.raw.background_music)
            player!!.setVolume(0.15f,0.15f)
        }
        player!!.start()
        played = true
        Log.i("MUSICA: ", "Reproduciendo, StartMusic")
    }

    fun stopMusic() {

        if (player != null) {
            player!!.pause()
            played = false
            Log.i("MUSICA: ", "Parando, stopMusic")
        }

    }


    fun buttonSound(sound: Int, context: Context) {
        buttonSoundPlayer = MediaPlayer.create(context, sound)
        buttonSoundPlayer!!.start()
    }


    fun stopMusicOnExit() {

        if (player != null) {
            player!!.pause()
        }

    }

    fun resumeMusicOnExit() {

        if (player != null) {
            player!!.start()
        }

    }


}