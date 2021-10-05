package com.grupox.game_primeros_test

object Constants {

    var questionImageList: ArrayList<Question>? = null
    var questionGifList: ArrayList<Question> = ArrayList()
    var questionFourImageList: ArrayList<Question> = ArrayList()

    fun getImageQuestions(): ArrayList<Question> {

        questionImageList = ArrayList()

        val question1 = Question(
            id = 1,
            question = "¿Qué dice Tomoshika en inglés que hace que Pikamee estalle de risa?",
            image = R.drawable.pregunta_uno,
            optionOne = "Let’s get some b*tches",
            optionTwo = "Let’s kill da h*e",
            optionThree = "Let’s go moth*rfuck*r",
            optionFour = "Let’s f*ck",
            correctAnswer = 2
        )
        questionImageList!!.add(question1)

        val question2 = Question(
            id = 1,
            question = "¿Por qué se hizo famoso este clip de Sakura Miko?",
            image = R.drawable.pregunta_dos,
            optionOne = "El juego se crashea y Miko llora",
            optionTwo = "El directo se corta de golpe porque se le va la luz",
            optionThree = "Miko, sin saber lo que significa, dice Nig*a de forma melódica ",
            optionFour = "Ella pensando que está silenciada se pone a hablar de cosas personales",
            correctAnswer = 3
        )

        questionImageList!!.add(question2)

        val question3 = Question(
            id = 1,
            question = "¿Cómo se conoce a esta agrupación de miembros de Hololive?",
            image = R.drawable.pregunta_tres,
            optionOne = "Hololive Gamers",
            optionTwo = "Hololive SuperStars",
            optionThree = "HoloMyth",
            optionFour = "OKFAMS",
            correctAnswer = 4
        )
        questionImageList!!.add(question3)


        val question4 = Question(
            id = 1,
            question = "A quién pertenece esta silueta?",
            image = R.drawable.pregunta_cuatro,
            optionOne = "Watame",
            optionTwo = "Lamy",
            optionThree = "Nene",
            optionFour = "Botan",
            correctAnswer = 1
        )
        questionImageList!!.add(question4)

        val question5 = Question(
            id = 1,
            question = "En un vídeo que Watame subió para supuestamente disculparse por algo, dijo lo " +
                    "siguiente… ¿Por qué se iba a disculpar? ",
            image = R.drawable.pregunta_cinco,
            optionOne = "Por enfadarse y cerrar el directo al perder en un juego",
            optionTwo = "Porque su internet era muy malo y tenía cortes de conexión",
            optionThree = "Porque hacía muy pocos directos",
            optionFour = "Porque sus directos eran muy cortos",
            correctAnswer = 2
        )
        questionImageList!!.add(question5)

        val question6 = Question(
            id = 1,
            question = "¿Cómo se llamaba el noticiario que Kiryu Coco hacía?",
            image = R.drawable.pregunta_seis,
            optionOne = "Coco News",
            optionTwo = "AsaCoco Live",
            optionThree = "News with Coco",
            optionFour = "Coco Daily",
            correctAnswer = 2
        )
        questionImageList!!.add(question6)

        val question7 = Question(
            id = 1,
            question = "¿Cómo se llama el anime semanal que hace Hololive con sus miembros?",
            image = R.drawable.pregunta_ocho,
            optionOne = "HoloMems",
            optionTwo = "Holo no Animation",
            optionThree = "Holo no Graffiti",
            optionFour = "Hololive!",
            correctAnswer = 3
        )
        questionImageList!!.add(question7)

        val question8 = Question(
            id = 1,
            question = "¿A qué se debe la abreviatura PPTenshi para referirse a Kanata?",
            image = R.drawable.pregunta_once,
            optionOne = "Es su apellido escrito de otra forma",
            optionTwo = "Una abreviación de “ángel bondadoso” en japonés",
            optionThree = "En su debut usó una presentación de PowerPoint para presentarse",
            optionFour = "Es un mote que le pusieron sus compañeros",
            correctAnswer = 3
        )
        questionImageList!!.add(question8)

        val question9 = Question(
            id = 1,
            question = "¿A que se debe el mote de “Gorilla Tenshi” para referirse a Kanata?",
            image = R.drawable.pregunta_doce,
            optionOne = "A que se enfada con mucha facilidad.",
            optionTwo = "A su corpulencia",
            optionThree = "A que en un directo dijo que tenía una fuerza de agarre de más de 50kg",
            optionFour = "A su altura",
            correctAnswer = 3
        )
        questionImageList!!.add(question9)

        val question10 = Question(
            id = 1,
            question = "¿Cuál es una burla amistosa que se le hace recurrentemente a Towa?",
            image = R.drawable.pregunta_trece,
            optionOne = "Que, a pesar de ser un demonio, es incapaz de cometer maldades",
            optionTwo = "Suele morir con facilidad en los juegos",
            optionThree = "Cuando se pone a hablar se desconcentra y se olvida de lo que está haciendo",
            optionFour = "Que siempre está gastando bromas a los demás miembros",
            correctAnswer = 1
        )
        questionImageList!!.add(question10)

        val question11 = Question(
            id = 1,
            question = "En un directo, Pekora le enseñó sus videos a un familiar… ¿quién era?",
            image = R.drawable.pregunta_catorce,
            optionOne = "Su tía",
            optionTwo = "Su hermana",
            optionThree = "Su madre",
            optionFour = "Su amiga",
            correctAnswer = 3
        )
        questionImageList!!.add(question11)

        val question12 = Question(
            id = 1,
            question = "¿Qué edad afirma tener Marine cada vez que le preguntan?",
            image = R.drawable.pregunta_quince,
            optionOne = "20",
            optionTwo = "21",
            optionThree = "17",
            optionFour = "19",
            correctAnswer = 3
        )
        questionImageList!!.add(question12)


        return questionImageList as ArrayList<Question>
    }

    fun getGifQuestions(): ArrayList<Question> {
        questionGifList = ArrayList()


        val question1 = Question(
            id = 1,
            question = "¿Con qué miembro de Hololive se asocia esta mascota?",
            image = R.drawable.pregunta_siete_gif,
            optionOne = "Ayame",
            optionTwo = "Mio",
            optionThree = "Luna",
            optionFour = "Subaru",
            correctAnswer = 4
        )
        questionGifList.add(question1)

        val question2 = Question(
            id = 1,
            question = "¿Qué representa Ceres Fauna?",
            image = R.drawable.pregunta_diez_gif,
            optionOne = "Es un hada",
            optionTwo = "Representa a la madre naturaleza",
            optionThree = "Es una semi-diosa",
            optionFour = "Es una gacela",
            correctAnswer = 2
        )
        questionGifList.add(question2)

        val question3 = Question(
            id = 1,
            question = "¿A qué animal representa Watame?",
            image = R.drawable.pregunta_nueve_gif,
            optionOne = "Oveja",
            optionTwo = "Cabra",
            optionThree = "Carnero",
            optionFour = "Toro",
            correctAnswer = 1
        )
        questionGifList.add(question3)


        return questionGifList
    }

    fun getFourImageQuestions(): ArrayList<Question> {
        questionFourImageList = ArrayList()

        val question1 = Question(
            id = 1,
            question = "Selecciona a Nakiri Ayame",
            image = R.drawable.pregunta_opciones_1_1,
            image2 = R.drawable.pregunta_opciones_1_2,
            image3 = R.drawable.pregunta_opciones_1_3,
            image4 = R.drawable.pregunta_opciones_1_4,
            correctAnswer = 1
        )
        questionFourImageList.add(question1)

        val question2 = Question(
            id = 1,
            question = "Selecciona la imagen que no se corresponda con un miembro de HoloLive",
            image = R.drawable.pregunta_opciones_2_1,
            image2 = R.drawable.pregunta_opciones_2_2,
            image3 = R.drawable.pregunta_opciones_2_3,
            image4 = R.drawable.pregunta_opciones_2_4,
            correctAnswer = 3
        )
        questionFourImageList.add(question2)
        val question3 = Question(
            id = 1,
            question = "Selecciona la imagen que se corresponda con un miembro de Hololive Indonesia",
            image = R.drawable.pregunta_opciones_3_1,
            image2 = R.drawable.pregunta_opciones_3_2,
            image3 = R.drawable.pregunta_opciones_3_3,
            image4 = R.drawable.pregunta_opciones_3_4,
            correctAnswer = 2
        )
        questionFourImageList.add(question3)
        val question4 = Question(
            id = 1,
            question = "Selecciona la imagen que se corresponda con un Vtuber independiente",
            image = R.drawable.pregunta_opciones_4_1,
            image2 = R.drawable.pregunta_opciones_4_2,
            image3 = R.drawable.pregunta_opciones_4_3,
            image4 = R.drawable.pregunta_opciones_4_4,
            correctAnswer = 3
        )
        questionFourImageList.add(question4)
        val question5 = Question(
            id = 1,
            question = "Selecciona la imagen que se corresponda con un miembro de Hololive Gamers:",
            image = R.drawable.pregunta_opciones_5_1,
            image2 = R.drawable.pregunta_opciones_5_2,
            image3 = R.drawable.pregunta_opciones_5_3,
            image4 = R.drawable.pregunta_opciones_5_4,
            correctAnswer = 1
        )
        questionFourImageList.add(question5)


        return questionFourImageList

    }

    fun getFragments(): ArrayList<QuizBaseTypeFragment> {

        val listFragment = ArrayList<QuizBaseTypeFragment>()

        val fragment1 = QuizImageType()
        listFragment.add(fragment1)

        val fragment2 = QuizGifType()
        listFragment.add(fragment2)

        val fragment3 = QuizFourImageType()
        listFragment.add(fragment3)

        return listFragment
    }

}