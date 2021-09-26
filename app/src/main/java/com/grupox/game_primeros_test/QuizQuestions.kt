package com.grupox.game_primeros_test

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlin.random.Random
import kotlin.random.nextInt

class QuizQuestions : AppCompatActivity(), View.OnClickListener {


    private var barCurrentPosition: Int = 0
    private var mQuestionsLists: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mQuestion: Question? = null
    private val nPreguntas = PlayerSettings.nQuestions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        PlayerSettings.rightQuestions = 0
        mQuestionsLists = Constants.getQuestions()
        progressBar.max = nPreguntas
        setQuestion()
        tv_respuesta1.setOnClickListener(this)
        tv_respuesta2.setOnClickListener(this)
        tv_respuesta3.setOnClickListener(this)
        tv_respuesta4.setOnClickListener(this)
        bt_confirmar.setOnClickListener(this)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
    }

    //Change bar visibility
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun setQuestion() {

        setDefaultOptionsView()
        barCurrentPosition++
        var questPosition = Random.nextInt(0, mQuestionsLists!!.size - 1)

        val question: Question? = mQuestionsLists!![questPosition]
        mQuestionsLists!!.removeAt(questPosition)

        mQuestion = question
        progressBar.progress = barCurrentPosition
        tv_progressBar.text = "$barCurrentPosition/" + nPreguntas


        tv_question.text = question!!.question
        questionImage.setImageResource(question.image)
        tv_respuesta1.text = question.optionOne
        tv_respuesta2.text = question.optionTwo
        tv_respuesta3.text = question.optionThree
        tv_respuesta4.text = question.optionFour

    }

    private fun setDefaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(tv_respuesta1)
        options.add(tv_respuesta2)
        options.add(tv_respuesta3)
        options.add(tv_respuesta4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#09101C"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.text_border)
        }

    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_respuesta1 -> {
                selectedOptionView(tv_respuesta1, 1)
            }
            R.id.tv_respuesta2 -> {
                selectedOptionView(tv_respuesta2, 2)
            }
            R.id.tv_respuesta3 -> {
                selectedOptionView(tv_respuesta3, 3)
            }
            R.id.tv_respuesta4 -> {
                selectedOptionView(tv_respuesta4, 4)
            }
            R.id.bt_confirmar -> {

                if (mSelectedOptionPosition == 0) {
                    bt_confirmar.text = "Selecciona una respuesta"
                } else if (mSelectedOptionPosition == -1) {
                    if (barCurrentPosition == nPreguntas) {
                        val intent = Intent(this, End_Activity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        mSelectedOptionPosition = 0
                        setQuestion()
                        bt_confirmar.text = "Comprobar"
                        tv_respuesta1.setOnClickListener(this)
                        tv_respuesta2.setOnClickListener(this)
                        tv_respuesta3.setOnClickListener(this)
                        tv_respuesta4.setOnClickListener(this)
                    }


                } else {
                    checkSolution()
                    tv_respuesta1.setOnClickListener(null)
                    tv_respuesta2.setOnClickListener(null)
                    tv_respuesta3.setOnClickListener(null)
                    tv_respuesta4.setOnClickListener(null)
                    if (barCurrentPosition == nPreguntas) {
                        bt_confirmar.text = "Resultado final"
                    } else {
                        bt_confirmar.text = "Siguente Pregunta"
                    }

                    mSelectedOptionPosition = -1
                }
            }
        }
    }


    fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {
        setDefaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#09101C"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_text_border)

    }


    fun showSolutionTextBorder(answer: Int, drawable: Int) {

        when (answer) {
            1 -> {
                tv_respuesta1.background = ContextCompat.getDrawable(this, drawable)
            }
            2 -> {
                tv_respuesta2.background = ContextCompat.getDrawable(this, drawable)
            }
            3 -> {
                tv_respuesta3.background = ContextCompat.getDrawable(this, drawable)
            }
            4 -> {
                tv_respuesta4.background = ContextCompat.getDrawable(this, drawable)
            }

        }


    }

    fun checkSolution() {
        if (mSelectedOptionPosition !== mQuestion!!.correctAnswer) {
            showSolutionTextBorder(mSelectedOptionPosition, R.drawable.wrong_text_border)
        } else {
            PlayerSettings.rightQuestions += 1
        }
        showSolutionTextBorder(mQuestion!!.correctAnswer, R.drawable.correct_text_border)
    }


    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }
}