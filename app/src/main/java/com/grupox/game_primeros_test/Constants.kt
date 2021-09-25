package com.grupox.game_primeros_test

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()


        val question1 =  Question(1,
            "Es bossy ??111111",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si, por ",
            "Todas son correctas",
            4)
        questionList.add(question1)


        val question2 =  Question(2,
            "Es bossy  ??22222222222",
            R.drawable.bossy,
            "Si",
            "Si es muy ",
            "Si, ",
            "Todas son correctas",
            4)
        questionList.add(question2)


        val question3 =  Question(3,
            "Es bossy re re re ??3333333",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si?",
            "Todas son correctas",
            4)
        questionList.add(question3)


        val question4 =  Question(4,
            "Es bossy4444444444444",
            R.drawable.bossy,
            "Si",
            "Si es mu",
            "Si, por ",
            "Todas son correctas",
            4)
        questionList.add(question4)


        val question5 =  Question(5,
            "Es bossy la persona  ??5555555555",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si, ",
            "Todas son correctas",
            4)
        questionList.add(question5)


        val question6 =  Question(6,
            "Es bossy la persona  ??6666666666",
            R.drawable.bossy,
            "Si",
            "Si es ",
            "Si, ",
            "Todas son correctas",
            4)
        questionList.add(question6)




        return questionList
    }

}