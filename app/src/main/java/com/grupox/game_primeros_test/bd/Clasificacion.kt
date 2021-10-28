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

        var cadena = ""

        val minutes: Long = tiempo / 1000 / 60

        if (minutes < 10)
            cadena += "0$minutes: "
        else
            cadena += "$minutes: "
        // formula for conversion for
        // milliseconds to seconds

        // formula for conversion for
        // milliseconds to seconds
        val seconds: Long = tiempo / 1000 % 60

        if (seconds < 10)
            cadena += " 0$seconds"
        else
            cadena += " $seconds"

        return cadena

    }

    fun esMejor(clasificacion: Clasificacion): Boolean {

        if (puntuation == clasificacion.puntuation) {
            return tiempo >= clasificacion.tiempo
        } else return puntuation <= clasificacion.puntuation
    }

    fun getSeconds(): Long {
        return tiempo / 1000 % 60
    }

    fun getMinutes(): Long {
        return tiempo / 1000 / 60
    }

    override fun toString(): String {
//        return "ID: " + id + " User: " + user + " Puntacion: " + puntuation + "Tiempo: " + parseIntoTime()
        return "Jugador: " + user + " Puntos: " + puntuation + " Tiempo: " + parseIntoTime()
    }
}
