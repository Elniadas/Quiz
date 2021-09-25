package com.grupox.game_primeros_test

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer

object Audio {
    var player: MediaPlayer? = null




     fun startMusic(context: Context) {
        if (player == null) {
            player = MediaPlayer.create(context, R.raw.background_music)
        }
        player!!.start()

    }


}