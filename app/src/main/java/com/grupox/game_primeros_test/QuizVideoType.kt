package com.grupox.game_primeros_test

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.MediaController
import androidx.core.content.ContextCompat
import com.grupox.game_primeros_test.bd.Pregunta
import kotlinx.android.synthetic.main.fragment_quiz_video_type.*
import kotlin.random.Random


class QuizVideoType : QuizBaseTypeFragment(), View.OnClickListener {
    private var mSelectedOptionPosition: Int = 0
    private var mQuestion: Pregunta? = null
    private var _isCompleted = false
    private var mediaController: MediaController? = null
    override fun isCompleted(): Boolean {
        return _isCompleted
    }

    override fun checkSolution() {
        if (mSelectedOptionPosition !== mQuestion!!.correctAnswer) {
            PlayerSettings.buttonSound(R.raw.fallo, requireContext().applicationContext)
            showSolutionTextBorder(mSelectedOptionPosition, R.drawable.estilo_boton_incorrecto)
        } else {
            PlayerSettings.buttonSound(R.raw.correcto, requireContext().applicationContext)
            PlayerSettings.rightQuestions += 1
        }
        showSolutionTextBorder(mQuestion!!.correctAnswer, R.drawable.estilo_boton_correcto)
    }

    fun showSolutionTextBorder(answer: Int, color: Int) {
        when (answer) {
            1 -> {
                bt_fragment_video_answer1.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            2 -> {
                bt_fragment_video_answer2.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            3 -> {
                bt_fragment_video_answer3.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            4 -> {
                bt_fragment_video_answer4.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }

        }
    }

    override fun nextQuestion() {
        setQuestion()
    }

    override fun getQuestionText(): String {
        return mQuestion!!.question
    }

    override fun QuestionsLeft(): Int {
        return Constants.questionVideoList.size
    }

    override fun Clone(): QuizBaseTypeFragment {
        return QuizVideoType()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (mediaController == null)
            mediaController = MediaController(activity)
        //Anchor view no está funcionando como debería
        mediaController!!.setAnchorView(video_question)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_video_type, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PlayerSettings.questAnswered = false;
        setQuestion()

    }

    private fun setQuestion() {
        _isCompleted = false
        var questPosition = Random.nextInt(0, Constants.questionVideoList.size)
        setDefaultOptionsView()
        val question: Pregunta = Constants.questionVideoList[questPosition]
        Constants.questionVideoList.removeAt(questPosition)

        mQuestion = question

        var a = activity as QuizFragments
        a.cambiarTexto(question.question)
        video_question.setVideoPath("android.resource://" + PACKAGE_NAME + "/" + question.image)
        video_question.setMediaController(mediaController)
        //para que haya una miniatura, avanza el fotograma de la primera imagen que aparece antes de darle play
        video_question.seekTo(100)
        bt_fragment_video_answer1.text = question.optionOne
        bt_fragment_video_answer2.text = question.optionTwo
        bt_fragment_video_answer3.text = question.optionThree
        bt_fragment_video_answer4.text = question.optionFour
        bt_fragment_video_answer1.setOnClickListener(this)
        bt_fragment_video_answer2.setOnClickListener(this)
        bt_fragment_video_answer3.setOnClickListener(this)
        bt_fragment_video_answer4.setOnClickListener(this)
    }

    private fun setDefaultOptionsView() {
        val options = ArrayList<Button>()
        options.add(bt_fragment_video_answer1)
        options.add(bt_fragment_video_answer2)
        options.add(bt_fragment_video_answer3)
        options.add(bt_fragment_video_answer4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#09101C"))
            option.typeface = Typeface.DEFAULT
            option.background =
                ContextCompat.getDrawable(
                    requireActivity().baseContext,
                    R.drawable.radio_normal_quiz
                )
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt_fragment_video_answer1 -> {
                PlayerSettings.questAnswered = true
                buttonAction(1)
            }
            R.id.bt_fragment_video_answer2 -> {
                PlayerSettings.questAnswered = true
                buttonAction(2)
            }
            R.id.bt_fragment_video_answer3 -> {
                PlayerSettings.questAnswered = true
                buttonAction(3)
            }
            R.id.bt_fragment_video_answer4 -> {
                PlayerSettings.questAnswered = true
                buttonAction(4)
            }

        }

    }

    fun removeListeners() {
        bt_fragment_video_answer1.setOnClickListener(null)
        bt_fragment_video_answer2.setOnClickListener(null)
        bt_fragment_video_answer3.setOnClickListener(null)
        bt_fragment_video_answer4.setOnClickListener(null)
    }

    fun buttonAction(posicion: Int) {
        mSelectedOptionPosition = posicion
        _isCompleted = true
        checkSolution()
        removeListeners()
    }
}