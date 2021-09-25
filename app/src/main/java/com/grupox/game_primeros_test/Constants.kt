package com.grupox.game_primeros_test

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()


        val question1 =  Question(1,
            "Es bossy ??",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si, por ",
            "Todas son correctas",
            4)
        questionList.add(question1)


        val question2 =  Question(2,
            "Es bossy  ??",
            R.drawable.bossy,
            "Si",
            "Si es muy ",
            "Si, ",
            "Todas son correctas",
            4)
        questionList.add(question2)


        val question3 =  Question(3,
            "Es bossy re re re ??",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si?",
            "Todas son correctas",
            4)
        questionList.add(question3)


        val question4 =  Question(4,
            "Es bossy",
            R.drawable.bossy,
            "Si",
            "Si es mu",
            "Si, por ",
            "Todas son correctas",
            4)
        questionList.add(question4)


        val question5 =  Question(5,
            "Es bossy la persona  ??",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si, ",
            "Todas son correctas",
            4)
        questionList.add(question5)

        return questionList
    }

}