package com.grupox.game_primeros_test

import android.content.Intent
import android.os.Bundle
import android.media.AudioManager
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_audio_screen.*
import kotlinx.android.synthetic.main.activity_main.*

class AudioScreen : Audio() {

    var audioManager: AudioManager? = null
    var vtuber: Vtuber? = null
    var vtuberName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_screen)

        adjustment_background.setImageResource(
            resources.getIdentifier(
                Constants.newBackGround,
                "drawable",
                packageName
            )
        )
        playAnimationOnEnter()
        bt_sound.setOnClickListener {
            play_stop()
        }
        rb_5preguntas.setOnClickListener { PlayerSettings.nQuestions = 5 }
        rb_10preguntas.setOnClickListener { PlayerSettings.nQuestions = 10 }
        rb_15preguntas.setOnClickListener { PlayerSettings.nQuestions = 15 }
        setupCustomSpinner()

    }

    private fun setupCustomSpinner() {
        val adapter = VtuberArrayAdapter(this, Vtubers.list!!)
        customSpinner.adapter = adapter
        customSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent!!.getItemAtPosition(position)
                vtuber = selectedItem as Vtuber
                vtuberName = vtuber!!.name
                vtuberName += "_new"

                Constants.newBackGround = vtuberName.lowercase()
                adjustment_background.setImageResource(
                    resources.getIdentifier(
                        Constants.newBackGround,
                        "drawable",
                        packageName
                    )
                )
                Vtubers.changeFirtsItem(position)
                Toast.makeText(this@AudioScreen, "$vtuberName", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    fun playAnimationOnEnter() {
        if (PlayerSettings.played) {
            bt_sound.setAnimation(R.raw.sound)
            bt_sound.playAnimation()

        } else {
            bt_sound.setAnimation(R.raw.mute)
            bt_sound.playAnimation()

        }
        when (PlayerSettings.nQuestions) {
            5 -> {
                rb_5preguntas.isChecked = true
            }
            10 -> {
                rb_10preguntas.isChecked = true
            }
            15 -> {
                rb_15preguntas.isChecked = true
            }
        }
    }

    fun play_stop() {
        if (PlayerSettings.played) {
            bt_sound.setAnimation(R.raw.mute)
            bt_sound.playAnimation()
            PlayerSettings.stopMusic()
        } else {
            bt_sound.setAnimation(R.raw.sound)
            bt_sound.playAnimation()
            PlayerSettings.startMusic(applicationContext)
        }

    }


    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        //or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }


}

