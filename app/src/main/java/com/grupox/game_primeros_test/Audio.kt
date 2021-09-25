package com.grupox.game_primeros_test

import android.content.Context
import android.content.Context.AUDIO_SERVICE
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.core.content.ContextCompat.getSystemService




object Audio {
    var player: MediaPlayer? = null



     fun startMusic(context: Context) {
        if (player == null) {
            player = MediaPlayer.create(context, R.raw.background_music)
        }
        player!!.start()

    }

    fun changeVolume(){




    }


}