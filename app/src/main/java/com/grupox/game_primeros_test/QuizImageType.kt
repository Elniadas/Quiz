package com.grupox.game_primeros_test


import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_one_image.*


import kotlin.random.Random


class QuizImageType() : QuizBaseTypeFragment(), View.OnClickListener {

    //private var mQuestionsLists: ArrayList<Question>? = Constants.getImageQuestions()
    private var mSelectedOptionPosition: Int = 0
    private var mQuestion: Question? = null
    private var _isCompleted = false

    /*
     constructor(list: ArrayList<Question>) : this() {
         mQuestionsLists = list
     }

     fun Clone(): QuizImageType {
         return QuizImageType(mQuestionsLists!!)
     }

     */




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        PlayerSettings.questAnswered = false;
        setQuestion()
        // bt_fragment_answer1.setOnClickListener(this)
        // bt_fragment_answer2.setOnClickListener(this)
        // bt_fragment_answer3.setOnClickListener(this)
        // bt_fragment_answer4.setOnClickListener(this)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one_image, container, false)
    }


    private fun setDefaultOptionsView() {
        val options = ArrayList<Button>()
        options.add(bt_fragment_answer1)
        options.add(bt_fragment_answer2)
        options.add(bt_fragment_answer3)
        options.add(bt_fragment_answer4)

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


    fun showSolutionTextBorder(answer: Int, color: Int) {
        when (answer) {
            1 -> {
                bt_fragment_answer1.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            2 -> {
                bt_fragment_answer2.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            3 -> {
                bt_fragment_answer3.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }
            4 -> {
                bt_fragment_answer4.background =
                    ContextCompat.getDrawable(requireActivity().baseContext, color)
            }

        }
    }


    private fun setQuestion() {

        _isCompleted = false
        //var questPosition = Random.nextInt(0, mQuestionsLists!!.size)
        var questPosition = Random.nextInt(0, Constants.questionImageList!!.size)
        setDefaultOptionsView()
        //val question: Question = mQuestionsLists!![questPosition]
        val question: Question = Constants.questionImageList!![questPosition]
        //mQuestionsLists!!.removeAt(questPosition)
        Constants.questionImageList!!.removeAt(questPosition)

        mQuestion = question
        var a = activity as QuizFragments
        a.cambiarTexto(question.question)
        iv_question.setImageResource(question.image)
        bt_fragment_answer1.text = question.optionOne
        bt_fragment_answer2.text = question.optionTwo
        bt_fragment_answer3.text = question.optionThree
        bt_fragment_answer4.text = question.optionFour

        bt_fragment_answer1.setOnClickListener(this)
        bt_fragment_answer2.setOnClickListener(this)
        bt_fragment_answer3.setOnClickListener(this)
        bt_fragment_answer4.setOnClickListener(this)


    }

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

    override public fun nextQuestion() {
        setQuestion()
    }

    override fun getQuestionText(): String {
        return mQuestion!!.question
    }

    override fun QuestionsLeft(): Int {
        //return mQuestionsLists!!.size
        return Constants.questionImageList!!.size
    }

    override fun Clone(): QuizBaseTypeFragment {
        return QuizImageType()
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt_fragment_answer1 -> {
                PlayerSettings.questAnswered = true
                buttonAction(1)
            }
            R.id.bt_fragment_answer2 -> {
                PlayerSettings.questAnswered = true
                buttonAction(2)
            }
            R.id.bt_fragment_answer3 -> {
                PlayerSettings.questAnswered = true
                buttonAction(3)
            }
            R.id.bt_fragment_answer4 -> {
                PlayerSettings.questAnswered = true
                buttonAction(4)
            }

        }
    }

    fun removeListeners() {
        bt_fragment_answer1.setOnClickListener(null)
        bt_fragment_answer2.setOnClickListener(null)
        bt_fragment_answer3.setOnClickListener(null)
        bt_fragment_answer4.setOnClickListener(null)
    }

    fun buttonAction(posicion: Int) {
        mSelectedOptionPosition = posicion
        _isCompleted = true
        checkSolution()
        removeListeners()
    }

}









