package com.grupox.game_primeros_test

import android.app.ActivityManager
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


open class Audio : AppCompatActivity() {

    override fun onStop() {
        super.onStop()



        if (PlayerSettings.played && !foregrounded()) {
            PlayerSettings.stopMusicOnExit()
            Toast.makeText(this, "Parando musica", Toast.LENGTH_SHORT)
            Log.i("MUSICA: ", "Parando")
        }

    }

    override fun onResume() {
        super.onResume()
        if (PlayerSettings.played) {
            PlayerSettings.resumeMusicOnExit()
            Toast.makeText(this, "Reanudando", Toast.LENGTH_SHORT)
            Log.i("MUSICA: ", "Reproduciendo")
        }
    }

    fun foregrounded(): Boolean {
        var appProcessInfo = ActivityManager.RunningAppProcessInfo()
        ActivityManager.getMyMemoryState(appProcessInfo);
        var r = (appProcessInfo.importance == IMPORTANCE_FOREGROUND || appProcessInfo.importance == IMPORTANCE_VISIBLE)
        Log.i("foregrounded: ", r.toString())
        return r
    }




}