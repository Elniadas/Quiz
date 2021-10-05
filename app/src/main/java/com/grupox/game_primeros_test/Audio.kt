package com.grupox.game_primeros_test

import android.app.ActivityManager
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
import android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.app.KeyguardManager
import android.content.Context


open class Audio : AppCompatActivity() {

    override fun onStop() {
        super.onStop()

        //foregrounded()
        //foregroundedV2()

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

    fun foregroundedV2(): Boolean {
        val km = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
        // App is foreground, but screen is locked, so show notification
        // App is foreground, but screen is locked, so show notification
        var r = km.inKeyguardRestrictedInputMode()
        Log.i("foregroundedV2: ", r.toString())
        return r
    }


}