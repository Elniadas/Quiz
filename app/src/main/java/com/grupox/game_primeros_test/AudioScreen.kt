package com.grupox.game_primeros_test

import android.os.Bundle
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_audio_screen.*

class AudioScreen : AppCompatActivity() {

    var audioManager: AudioManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_screen)
        playAnimationOnEnter()
        bt_sound.setOnClickListener {
            play_stop()
        }

    }


    fun playAnimationOnEnter(){
        if(PlayerSettings.played){
            bt_sound.setAnimation(R.raw.sound_on)
            bt_sound.playAnimation()

        }else{
            bt_sound.setAnimation(R.raw.sound_off)
            bt_sound.playAnimation()

        }
    }

    fun play_stop(){
        if(PlayerSettings.played){
            bt_sound.setAnimation(R.raw.sound_off)
            bt_sound.playAnimation()

            PlayerSettings.stopMusic()
        }else{
            bt_sound.setAnimation(R.raw.sound_on)
            bt_sound.playAnimation()
            PlayerSettings.startMusic(applicationContext)
        }

    }


}

