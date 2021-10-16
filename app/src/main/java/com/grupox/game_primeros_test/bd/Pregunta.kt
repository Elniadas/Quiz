package com.grupox.game_primeros_test.bd

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pregunta(


    val question: String,
    val image: Int,
    val image2: Int? = null,
    val image3: Int? = null,
    val image4: Int? = null,
    val optionOne: String? = null,
    val optionTwo: String? = null,
    val optionThree: String? = null,
    val optionFour: String? = null,
    val correctAnswer: Int

){
    @PrimaryKey(autoGenerate = false)
    val id: Int=0
}

