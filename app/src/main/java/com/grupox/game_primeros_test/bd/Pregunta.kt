package com.grupox.game_primeros_test.bd

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pregunta(

    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val question: String,
    val image: Int,
    val image2: Int? = null,
    val image3: Int? = null,
    val image4: Int? = null,
    val optionOne: String? = null,
    val optionTwo: String? = null,
    val optionThree: String? = null,
    val optionFour: String? = null,
    val type :String,
    val correctAnswer: Int

) {
    constructor(pregunta:Pregunta) : this(
        pregunta.id,pregunta.question,pregunta.image,pregunta.image2,pregunta.image3,pregunta.image4,
        pregunta.optionOne,pregunta.optionTwo,pregunta.optionThree,pregunta.optionFour,pregunta.type,
        pregunta.correctAnswer
    )

    override fun toString(): String {
        var string = "";
        val sid = "Id: " + id
        val squestion = " | Question : " + question
        val simage = " | Image: " + image
        string = sid + squestion + simage
        if (image2 != null) {
            string += " | image2 : " + image2
        }
        if (image3 != null) {
            string += " | image3 : " + image3
        }

        if (image4 != null) {
            string += " | image4 : " + image4
        }

        if (optionOne != null) {
            string += " | optionOne : " + optionOne
        }

        if (optionTwo != null) {
            string += " | optionTwo : " + optionTwo
        }

        if (optionThree != null) {
            string += " | optionThree : " + optionThree
        }

        string += " | type: "+type
        string += " | correctAnswer : " + correctAnswer


        return string;
    }
}
