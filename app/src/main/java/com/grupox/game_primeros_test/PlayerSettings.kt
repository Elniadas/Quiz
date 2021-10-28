package com.grupox.game_primeros_test

import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import com.grupox.game_primeros_test.bd.Clasificacion


object PlayerSettings {
    var player: MediaPlayer? = null
    var played
        get() = LoadData.prefs.audio
        set(value) {
            LoadData.prefs.audio = value
        }

    var rightQuestions: Int = 0
    var wrongQuestions: Int = 0
    var questAnswered = false
    var buttonSoundPlayer: MediaPlayer? = null
    lateinit var ultimaPuntuacion : Clasificacion
    var tiempoPrueba :Long=0

    fun startMusic(context: Context) {
        if (player == null) {

            player = MediaPlayer.create(context, R.raw.background_music)
            player!!.setVolume(0.15f, 0.15f)
            player!!.isLooping = true
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
        if (played) {
            buttonSoundPlayer = MediaPlayer.create(context, sound)
            buttonSoundPlayer!!.start()
        }

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

    fun volumenNormal(){
        player!!.setVolume(0.15f, 0.15f)
    }

    fun volumenBajo(){
        player!!.setVolume(0.02f, 0.02f)
    }


}