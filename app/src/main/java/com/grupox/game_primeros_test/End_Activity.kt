package com.grupox.game_primeros_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class End_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        tv_rightQuestions.text = "Preguntas acertadas en total : ${PlayerSettings.rightQuestions}/${PlayerSettings.nQuestions}"

        bt_playAgain.setOnClickListener({
            val intent = Intent(this, QuizQuestions::class.java)
            startActivity(intent)
            finish()

        })

        bt_backToMenuFromEnd.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        })

    }
}