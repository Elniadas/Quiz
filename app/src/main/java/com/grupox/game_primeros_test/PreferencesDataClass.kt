package com.grupox.game_primeros_test

import android.content.Context
import android.content.SharedPreferences

class PreferencesDataClass(context: Context) {
    val PREFS_NAME = "user_settings"
    val SHARED_NAME = "user_name"
    val NUM_QUESTIONS = "num_questions"
    val BOOL_AUDIO = "audio_state"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, 0)

    var name: String
        get() = prefs.getString(SHARED_NAME, "")!!
        set(value) = prefs.edit().putString(SHARED_NAME, value).apply()
    var nPreguntas:Int
        get() = prefs.getInt(NUM_QUESTIONS,5)
        set(value) = prefs.edit().putInt(NUM_QUESTIONS,value).apply()
    var audio:Boolean
        get() = prefs.getBoolean(BOOL_AUDIO,true)
        set(value) = prefs.edit().putBoolean(BOOL_AUDIO,value).apply()
}