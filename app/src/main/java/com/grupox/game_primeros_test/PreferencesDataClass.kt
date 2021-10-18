package com.grupox.game_primeros_test

import android.content.Context
import android.content.SharedPreferences

class PreferencesDataClass(context: Context) {
    val PREFS_NAME = "user_settings"
    val SHARED_NAME = "user_name"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, 0)

    var name: String
        get() = prefs.getString(SHARED_NAME, "")!!
        set(value) = prefs.edit().putString(SHARED_NAME, value).apply()


}