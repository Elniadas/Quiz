package com.grupox.game_primeros_test

import androidx.fragment.app.Fragment

abstract class QuizBaseTypeFragment : Fragment() {


    abstract fun isCompleted(): Boolean
    abstract fun checkSolution()
    abstract fun nextQuestion()
    abstract fun getQuestionText(): String
    abstract fun QuestionsLeft(): Int
    abstract fun Clone(): QuizBaseTypeFragment

}