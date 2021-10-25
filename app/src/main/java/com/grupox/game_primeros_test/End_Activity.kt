package com.grupox.game_primeros_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.grupox.game_primeros_test.bd.Clasificacion
import com.grupox.game_primeros_test.bd.PreguntaViewModel
import kotlinx.android.synthetic.main.activity_end.*

class End_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_end)

        var _PreguntaViewModer = ViewModelProvider(this).get(PreguntaViewModel::class.java)
        var nombre = LoadData.prefs.name
        if(nombre =="")
            nombre = "anonimo"

        tv_rightQuestions.text =
            "Preguntas acertadas de ${nombre}  en total : ${PlayerSettings.rightQuestions}/" +
                    "${LoadData.prefs.nPreguntas} con un tiempo de: "+Constants.parseIntoTime(PlayerSettings.tiempoPrueba)

        bt_playAgain.setOnClickListener {
            val intent = Intent(this, QuizFragments::class.java)
            startActivity(intent)
            finish()

        }

        bt_backToMenuFromEnd.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
            finish()

        }
        end_background.setImageResource(
            resources.getIdentifier(
                Constants.newBackGround,
                "drawable",
                packageName
            )
        )
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
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