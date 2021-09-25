package com.grupox.game_primeros_test

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        //region Start

        super.onCreate(savedInstanceState)
        // If the Android version is lower than Jellybean, use this call to hide
        // the status bar.
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }



        setContentView(R.layout.activity_main)
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        //endregion
        //Code

        PlayerSettings.startMusic(applicationContext)

        bt_play.setOnClickListener({
            val intent = Intent(this, QuizQuestions::class.java)
            startActivity(intent)
            finish()
        })

        bt_ajustes.setOnClickListener({
            val intent = Intent(this, AudioScreen::class.java)
            startActivity(intent)
            finish()
        })


    }



}