package com.grupox.game_primeros_test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_quiz_questions_old.*
import kotlin.random.Random

class QuizFragments : Audio() {


    var _fragments: ArrayList<QuizBaseTypeFragment>? = null
    var _currentFragment: Int = -1
    private val nPreguntas = LoadData.prefs.nPreguntas
    var _preguntasCompletadas = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions_old)


        Constants.getImageQuestions()
        Constants.getGifQuestions()
        Constants.getFourImageQuestions()
        Constants.getVideoQuestion()
        //Initialize variables
        _fragments = Constants.getFragments()
        PlayerSettings.rightQuestions = 0
        pb_quiz.max = nPreguntas
        setFragment()

        //Boton


        bt_confirmar_quiz.setOnClickListener {
            Log.i("PREGUNTAS: ", "Preguntas completadas : " + _preguntasCompletadas)

            avanzar()

        }

    }


    @SuppressLint("SetTextI18n")
    private fun updateProgressBar() {
        _preguntasCompletadas++
        tv_texto_progress_bar.text =
            _preguntasCompletadas.toString() + " / " + LoadData.prefs.nPreguntas.toString()
        pb_quiz.progress = _preguntasCompletadas
    }

    private fun getNextFragment(): Int {
        return Random.nextInt(_fragments!!.size)
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.setCustomAnimations(
            R.anim.slide_in, R.anim.fade_out,
            R.anim.fade_in, R.anim.slide_out
        )

        fragmentTransaction.replace(R.id.fragmentContainer_Quiz, fragment)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.commit()


    }


    private fun setFragment() {
        var nextFragment = getNextFragment()
        Log.i("Fragmento y tal: ", "Frag: " + nextFragment)
        while (_fragments!![nextFragment].QuestionsLeft() < 0) {
            _fragments!!.removeAt(nextFragment)
            nextFragment = getNextFragment()
            Log.i("Fragmento while :  ", "Frag: " + nextFragment)
        }
        _currentFragment = nextFragment
        Log.i("current = a  :  ", _currentFragment.toString())
        updateProgressBar()
        _fragments!![_currentFragment] = _fragments!![_currentFragment].Clone()
        replaceFragment(_fragments!![_currentFragment])
        /*
         if (nextFragment == _currentFragment) {
             // _fragments!![_currentFragment].nextQuestion()
             replaceFragment(QuizImageType())
         } else {
             _currentFragment = nextFragment
             //replaceFragment(_fragments!![_currentFragment])
             replaceFragment(QuizImageType())
         }
         //
         */
    }


    fun avanzar(){
        if (_preguntasCompletadas == nPreguntas) {

            if (_fragments!![_currentFragment].isCompleted()) {
                val intent = Intent(this, End_Activity::class.java)
                startActivity(intent)
                finish()
            } else {
                if (!PlayerSettings.questAnswered) {
                    bt_confirmar_quiz.text = "Responde a la pregunta primero"

                }
            }

        } else {
            if (PlayerSettings.questAnswered) {
                bt_confirmar_quiz.text = "Siguiente"
                if (_preguntasCompletadas == nPreguntas - 1) {
                    bt_confirmar_quiz.text = "Finalizar"
                }
                setFragment()

            } else {
                bt_confirmar_quiz.text = "Responde a la pregunta primero"
            }
        }
    }

    fun cambiarTexto(texto: String) {
        tv_texto_fragmento.text = texto
    }


}