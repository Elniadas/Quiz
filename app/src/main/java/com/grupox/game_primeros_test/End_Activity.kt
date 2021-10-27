package com.grupox.game_primeros_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.grupox.game_primeros_test.bd.Clasificacion
import com.grupox.game_primeros_test.bd.PreguntaViewModel
import kotlinx.android.synthetic.main.activity_end.*
import kotlinx.android.synthetic.main.alert_layout.view.*

class End_Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_end)

        var nombre = LoadData.prefs.name
        if (nombre == "")
            nombre = "anonimo"

        tv_rightQuestions.text =
            "Preguntas acertadas de ${nombre}  en total : ${PlayerSettings.rightQuestions}/" +
                    "${LoadData.prefs.nPreguntas} con un tiempo de: " + Constants.parseIntoTime(
                PlayerSettings.tiempoPrueba
            )

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



        if(CheckPolePosition()){
            crearDialogo()
        }

    }


    private fun crearDialogo(){
        //Inflate the dialog with custom view
        val mDialogView = LayoutInflater.from(this).inflate(R.layout.alert_layout, null)
        //AlertDialogBuilder
        val mBuilder = AlertDialog.Builder(this)
            .setView(mDialogView)
            .setTitle("No tienes usuario")
        //show dialog
        val  mAlertDialog = mBuilder.show()
        //login button click of custom layout
        mDialogView.bt_continuar.setOnClickListener {
            //dismiss dialog
            mAlertDialog.dismiss()
            val intent = Intent(this, QuizFragments::class.java)
            startActivity(intent)

        }
        //cancel button click of custom layout
        mDialogView.bt_cambiar.setOnClickListener {
            //dismiss dialog
            mAlertDialog.dismiss()
            val intent = Intent(this, AudioScreen::class.java)
            startActivity(intent)
        }
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


    private fun CheckPolePosition(): Boolean {

        var clasificaciones: ArrayList<Clasificacion> = ArrayList(Constants.clasificacionesList)

        var cont = 1

        clasificaciones.forEach { clasificacion ->
            if (cont <= 3) {
                if (clasificacion.esMejor(PlayerSettings.ultimaPuntuacion))
                    return true
                else
                    cont++
            } else {
                return false
            }
        }

        if(cont<3)
            return true

       return false
    }


}