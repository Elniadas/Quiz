package com.grupox.game_primeros_test.bd

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Clasificacion(

    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var user: String,
    var puntuation: Int,
    var tiempo: Long
) {
    constructor(user: String, puntuation: Int, tiempo: Long) : this(0, user, puntuation, tiempo)

    fun parseIntoTime(): String {

        val minutes: Long = tiempo / 1000 / 60

        // formula for conversion for
        // milliseconds to seconds

        // formula for conversion for
        // milliseconds to seconds
        val seconds: Long = tiempo / 1000 % 60

        return "" + minutes + " : " + seconds

    }



    fun getSeconds():Long{
        return tiempo / 1000 % 60
    }

    fun getMinutes():Long{
        return tiempo / 1000 / 60
    }

    override fun toString(): String {
        return "ID: " + id + " User: " + user + " Puntacion: " + puntuation+ "Tiempo: "+ parseIntoTime()
    }
}
