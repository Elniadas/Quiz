package com.grupox.game_primeros_test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

var PACKAGE_NAME: String? = null

class MainActivity : Audio() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        PACKAGE_NAME = applicationContext.packageName;
//        window.decorView.apply {
//            systemUiVisibility =
//                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
//        }

        setContentView(R.layout.activity_main)
        //randomBg()
        setBgUser()
        if (PlayerSettings.appStart)
            PlayerSettings.startMusic(applicationContext)

        PlayerSettings.appStart = false

        bt_play.setOnClickListener {
            val intent = Intent(this, QuizFragments::class.java)
            startActivity(intent)
        }

        bt_ajustes.setOnClickListener {
            val intent = Intent(this, AudioScreen::class.java)
            startActivity(intent)
        }

        Constants.getPreguntasImage(this)

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

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }

}