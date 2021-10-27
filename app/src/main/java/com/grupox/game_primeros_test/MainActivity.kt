package com.grupox.game_primeros_test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alert_layout.*
import kotlinx.android.synthetic.main.alert_layout.view.*

import kotlin.random.Random

var PACKAGE_NAME: String? = null

class MainActivity : Audio() {


    var primera = true;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        PACKAGE_NAME = applicationContext.packageName;
//        window.decorView.apply {
//            systemUiVisibility =
//                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
//        }

        setContentView(R.layout.activity_main)
        //randomBg()
        setBgUserPrefs()
        if (PlayerSettings.played)
            PlayerSettings.startMusic(applicationContext)


        val builder = AlertDialog.Builder(this)


        bt_play.setOnClickListener {

            if (LoadData.prefs.name.isEmpty() || LoadData.prefs.name == "") {

                crearDialogo()


//                if (primera == true) {
//                    builder.setTitle("No has insertado nombre de usuario")
//                    builder.setMessage("Si no pones usuario no guardaras la clasificacion\n\n Para cambiarlo entra en opciones")
//                    builder.show()
//                    primera = false
//
//                } else {
//                    val intent = Intent(this, QuizFragments::class.java)
//                    startActivity(intent)
//                }
            } else {
                val intent = Intent(this, QuizFragments::class.java)
                startActivity(intent)

            }
        }

        bt_ajustes.setOnClickListener {
            primera = true
            val intent = Intent(this, AudioScreen::class.java)
            startActivity(intent)
        }
        bt_clasificacion.setOnClickListener {
            primera = true
            val intent = Intent(this, Ladderboard::class.java)
            startActivity(intent)
        }

        // AUXCREARDATA.inicializar(this)
        // AUXCREARDATA.createPreguntas()
        // AUXCREARDATA.clasificaciones()

        Constants.getPreguntasImage(this)


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

    override fun onResume() {
        super.onResume()
        setBgUser()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }


    fun hideSystemUI() {
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

    //picks a random hololive member for the mainActivity background image
    private fun randomBg() {
        var listOfBackgrounds = arrayListOf<Int>()
        listOfBackgrounds.addAll(
            listOf(
//                R.drawable.achan,
//                R.drawable.aki,
                R.drawable.aloe,
//                R.drawable.amelia,
//                R.drawable.anya,
                R.drawable.aqua,
//                R.drawable.ayame,
//                R.drawable.azki,
//                R.drawable.botan,
                R.drawable.calliope,
//                R.drawable.choco,
//                R.drawable.coco,
//                R.drawable.flare,
//                R.drawable.fubuki,
//                R.drawable.gura,
//                R.drawable.haachama,
//                R.drawable.ina,
//                R.drawable.iofi,
//                R.drawable.kanata,
//                R.drawable.kiara,
//                R.drawable.korone,
//                R.drawable.lamy,
                R.drawable.luna,
//                R.drawable.marine,
//                R.drawable.matsuri,
//                R.drawable.mel,
//                R.drawable.miko,
//                R.drawable.mio,
                R.drawable.moona,
//                R.drawable.nene,
//                R.drawable.noel,
                R.drawable.okayu,
//                R.drawable.ollie,
//                R.drawable.pekora,
//                R.drawable.polka,
                R.drawable.reine,
//                R.drawable.risu,
//                R.drawable.roboco,
//                R.drawable.rushia,
                R.drawable.shion,
//                R.drawable.sora,
//                R.drawable.subaru,
//                R.drawable.suisei,
                R.drawable.towa,
//                R.drawable.watame
            )
        )
        var randomImage: Int =
            Random(System.nanoTime()).nextInt(0, listOfBackgrounds.size - 1)
        Log.i("random", randomImage.toString())
        main_menu_background.setImageResource(listOfBackgrounds[randomImage])
    }

    private fun setBgUser() {
        main_menu_background.setImageResource(
            resources.getIdentifier(
                Constants.newBackGround,
                "drawable",
                packageName
            )
        )
    }

    private fun setBgUserPrefs() {
        Constants.newBackGround =
            Vtubers.list?.get(LoadData.prefs.fondo)?.name?.lowercase() + "_new"
        main_menu_background.setImageResource(
            resources.getIdentifier(
                Constants.newBackGround,
                "drawable",
                packageName
            )
        )
        Vtubers.changeFirtsItem(LoadData.prefs.fondo)

    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }

}