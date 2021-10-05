package com.grupox.game_primeros_test

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_one_gif.*
import kotlinx.android.synthetic.main.fragment_one_gif.bt_fragment_answer1
import kotlinx.android.synthetic.main.fragment_one_gif.bt_fragment_answer2
import kotlinx.android.synthetic.main.fragment_one_gif.bt_fragment_answer3
import kotlinx.android.synthetic.main.fragment_one_gif.bt_fragment_answer4
import kotlinx.android.synthetic.main.fragment_one_image.*
import kotlinx.android.synthetic.main.fragment_quiz_four_image_type.*
import kotlin.random.Random

class QuizFourImageType : QuizBaseTypeFragment(), View.OnClickListener {

    private var mSelectedOptionPosition: Int = 0
    private var mQuestion: Question? = null
    private var _isCompleted = false

    override fun isCompleted(): Boolean {
        return _isCompleted
    }

    fun showSolutionTextBorder(answer: Int, color: Int) {
        when (answer) {
            // Es obligatorio hacer esta comprobación por temas de API,
            // Los de Android pensaron que era la mejor idea de lidiar con versiones antiguas
            //que no contaban con esta propiedad
            1 -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    iv_question2.foreground =
                        ContextCompat.getDrawable(requireActivity().baseContext, color)
                }
            }
            2 -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    iv_question3.foreground =
                        ContextCompat.getDrawable(requireActivity().baseContext, color)
                }
            }
            3 -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    iv_question4.foreground =
                        ContextCompat.getDrawable(requireActivity().baseContext, color)
                }
            }
            4 -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    iv_question5.foreground =
                        ContextCompat.getDrawable(requireActivity().baseContext, color)
                }
            }

        }
    }

    override fun checkSolution() {
        if (mSelectedOptionPosition !== mQuestion!!.correctAnswer) {
            showSolutionTextBorder(mSelectedOptionPosition, R.drawable.wrong_image_border)
        } else {
            PlayerSettings.rightQuestions += 1
        }
        showSolutionTextBorder(mQuestion!!.correctAnswer, R.drawable.correct_image_border)
    }

    private fun setDefaultOptionsView() {
        val options = ArrayList<ImageView>()
        options.add(iv_question2)
        options.add(iv_question3)
        options.add(iv_question4)
        options.add(iv_question5)

        for (option in options) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                option.foreground =
                    ContextCompat.getDrawable(
                        requireActivity().baseContext,
                        R.drawable.neutral_image_border
                    )
            }
        }
    }

    private fun setQuestion() {
        _isCompleted = false
        var questPosition = Random.nextInt(Constants.questionFourImageList.size)
        setDefaultOptionsView()
        val question: Question = Constants.questionFourImageList[questPosition]
        Constants.questionFourImageList.removeAt(questPosition)

        mQuestion = question
        var a = activity as QuizFragments
        a.cambiarTexto(question.question)
        iv_question2.setImageResource(question.image)
        iv_question3.setImageResource(question.image2!!)
        iv_question4.setImageResource(question.image3!!)
        iv_question5.setImageResource(question.image4!!)

        iv_question2.setOnClickListener(this)
        iv_question3.setOnClickListener(this)
        iv_question4.setOnClickListener(this)
        iv_question5.setOnClickListener(this)


    }


    override fun nextQuestion() {
        setQuestion()
    }

    override fun getQuestionText(): String {
        return mQuestion!!.question
    }

    override fun QuestionsLeft(): Int {
        return Constants.questionFourImageList.size - 1
    }

    override fun Clone(): QuizBaseTypeFragment {
        return QuizFourImageType()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_four_image_type, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        PlayerSettings.questAnswered = false;
        setQuestion()

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.iv_question2 -> {
                PlayerSettings.questAnswered = true
                buttonAction(1)
            }
            R.id.iv_question3 -> {
                PlayerSettings.questAnswered = true
                buttonAction(2)
            }
            R.id.iv_question4 -> {
                PlayerSettings.questAnswered = true
                buttonAction(3)
            }
            R.id.iv_question5 -> {
                PlayerSettings.questAnswered = true
                buttonAction(4)
            }

        }
    }

    fun removeListeners() {
        iv_question2.setOnClickListener(null)
        iv_question3.setOnClickListener(null)
        iv_question4.setOnClickListener(null)
        iv_question5.setOnClickListener(null)
    }

    fun buttonAction(posicion: Int) {
        mSelectedOptionPosition = posicion
        _isCompleted = true
        checkSolution()
        removeListeners()
    }
}