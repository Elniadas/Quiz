package com.grupox.game_primeros_test

import android.app.Application
import androidx.appcompat.app.AppCompatActivity

class LoadData : Application() {

    companion object {
        lateinit var prefs: PreferencesDataClass
    }

    override fun onCreate() {
        super.onCreate()
        prefs = PreferencesDataClass(applicationContext)

    }


}