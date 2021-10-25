package com.grupox.game_primeros_test

import android.os.Bundle
import android.media.AudioManager
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_audio_screen.*


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
        setUpIU()
        bt_sound.setOnClickListener {
            play_stop()
        }
        back_adjustent_button.setOnClickListener {
            onBackPressed()
        }



        et_set_user_name.afterTextChangedDelayed {
            LoadData.prefs.name = it
        }

        et_set_user_layout.setEndIconOnClickListener({
            LoadData.prefs.name = et_set_user_name.text.toString()
        })


        //*/

        rb_5preguntas.setOnClickListener { LoadData.prefs.nPreguntas = 5 }
        rb_10preguntas.setOnClickListener { LoadData.prefs.nPreguntas = 10 }
        rb_15preguntas.setOnClickListener { LoadData.prefs.nPreguntas = 15 }
        setupCustomSpinner()
        Constants.read()


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
                LoadData.prefs.fondo = vtuber!!.listPos
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

    fun setUpIU() {
        if (PlayerSettings.played) {
            bt_sound.setAnimation(R.raw.sound)
            bt_sound.playAnimation()

        } else {
            bt_sound.setAnimation(R.raw.mute)
            bt_sound.playAnimation()

        }
        if (LoadData.prefs.name.isNotEmpty()) {
            et_set_user_name.setText(LoadData.prefs.name)
//            et_set_user_name.setTe
        }


        when (LoadData.prefs.nPreguntas) {
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


    // https://stackoverflow.com/questions/35224459/how-to-detect-if-users-stop-typing-in-edittext-android

    fun EditText.afterTextChangedDelayed(afterTextChanged: (String) -> Unit) {
        this.addTextChangedListener(object : TextWatcher {
            var timer: CountDownTimer? = null

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(editable: Editable?) {
                timer?.cancel()
                timer = object : CountDownTimer(1000, 1500) {
                    override fun onTick(millisUntilFinished: Long) {}
                    override fun onFinish() {
                        afterTextChanged.invoke(editable.toString())
                    }
                }.start()
            }
        })
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
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }


}

