package com.grupox.game_primeros_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.grupox.game_primeros_test.bd.Clasificacion
import com.grupox.game_primeros_test.bd.PreguntaViewModel
import kotlinx.android.synthetic.main.activity_end.*
import kotlinx.android.synthetic.main.alert_clasificacion.*
import kotlinx.android.synthetic.main.alert_clasificacion.view.*
import kotlinx.android.synthetic.main.alert_layout.view.*


class End_Activity : AppCompatActivity() {

    var clasificaciones: ArrayList<Clasificacion> = ArrayList(Constants.clasificacionesList)
    var posicion: Int = -1

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
            "Preguntas acertadas de ${nombre} en total: ${PlayerSettings.rightQuestions}/" +
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



        if (CheckPolePosition()) {
            crearDialogoMaterial()
        }

    }


    private fun crearDialogo() {

        //Inflate the dialog with custom view
        val mDialogViewClasificacion =
            LayoutInflater.from(this).inflate(R.layout.alert_clasificacion, null)
        //AlertDialogBuilder

        val mBuilderClasificacion = AlertDialog.Builder(this)
            .setView(mDialogViewClasificacion)
            .setTitle("FELICIDADES!")
        //show dialog
        val mAlertDialog = mBuilderClasificacion.show()
        //login button click of custom layout

        var marcado = false

        for (i in 0..2) {
            if (i == posicion - 1) {
                mDialogViewClasificacion.tv_posicion1.text =
                    mDialogViewClasificacion.tv_posicion1.text.toString() + PlayerSettings.ultimaPuntuacion + "\n"
                marcado = true
            } else {
                if (marcado)
                    mDialogViewClasificacion.tv_posicion1.text =
                        mDialogViewClasificacion.tv_posicion1.text.toString() + clasificaciones[i - 1].toString() + "\n"
                else
                    mDialogViewClasificacion.tv_posicion1.text =
                        mDialogViewClasificacion.tv_posicion1.text.toString() + clasificaciones[i].toString() + "\n"

            }

        }


    }

    private fun crearDialogoMaterial() {
        val titleText: TextView = TextView(this)
        titleText.text = "¡Felicidades!"
        titleText.gravity = Gravity.CENTER
        titleText.setTextColor(getColor(R.color.lila))
        titleText.setPadding(0, 30, 0, 0)
        titleText.textSize = 25.0f
        //Inflate the dialog with custom view
        val mDialogViewClasificacion =
            LayoutInflater.from(this).inflate(R.layout.alert_clasificacion, null)
        //AlertDialogBuilder

        var mBuilderRounded = MaterialAlertDialogBuilder(
            ContextThemeWrapper(
                this,
                R.style.ThemeOverlay_App_MaterialAlertDialog
            )
        ).setView(mDialogViewClasificacion)
            .setCustomTitle(titleText)
            .show()
//            .setTitle("¡No tienes usuario!")
//                .setMessage(R.string.aviso_sin_nombre)
        //show dialog
        //val mAlertDialog = mBuilderClasificacion.show()
        //login button click of custom layout

        var marcado = false

        for (i in 0..2) {
            if (i == posicion - 1) {
                mDialogViewClasificacion.tv_posicion1.text =
                    mDialogViewClasificacion.tv_posicion1.text.toString() + PlayerSettings.ultimaPuntuacion + "\n"
                marcado = true
            } else {
                if (marcado)
                    mDialogViewClasificacion.tv_posicion1.text =
                        mDialogViewClasificacion.tv_posicion1.text.toString() + clasificaciones[i - 1].toString() + "\n"
                else
                    mDialogViewClasificacion.tv_posicion1.text =
                        mDialogViewClasificacion.tv_posicion1.text.toString() + clasificaciones[i].toString() + "\n"

            }

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


        var cont = 1

        clasificaciones.forEach { clasificacion ->
            if (cont <= 3) {
                if (clasificacion.esMejor(PlayerSettings.ultimaPuntuacion)) {


                    posicion = cont
                    return true
                } else
                    cont++
            } else {
                return false
            }
        }

        if (cont < 3) {
            posicion = clasificaciones.count()
            return true
        }


        return false
    }


}