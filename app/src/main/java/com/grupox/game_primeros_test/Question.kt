package com.grupox.game_primeros_test

data class Question(
    val id: Int,
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

)