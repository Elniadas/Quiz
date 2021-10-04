package com.grupox.game_primeros_test

object Constants {

    var questionImageList: ArrayList<Question>? = null
    var questionGifList: ArrayList<Question> = ArrayList<Question>()

    fun getImageQuestions(): ArrayList<Question> {

        questionImageList = ArrayList<Question>()

        val question1 = Question(
            1,
            "¿Qué dice Tomoshika en inglés que hace que Pikamee estalle de risa?",
            R.drawable.pregunta_uno,
            "Let’s get some b*tches",
            "Let’s kill da h*e",
            "Let’s go moth*rfuck*r",
            "Let’s f*ck",
            2
        )
        questionImageList!!.add(question1)

        val question2 = Question(
            1,
            "¿Por qué se hizo famoso este clip de Sakura Miko?",
            R.drawable.pregunta_dos,
            "El juego se crashea y Miko llora",
            "El directo se corta de golpe porque se le va la luz",
            "Miko, sin saber lo que significa, dice Nig*a de forma melódica ",
            "Ella pensando que está silenciada se pone a hablar de cosas personales",
            3
        )

        questionImageList!!.add(question2)

        val question3 = Question(
            1,
            "¿Cómo se conoce a esta agrupación de miembros de Hololive?",
            R.drawable.pregunta_tres,
            "Hololive Gamers",
            "Hololive SuperStars",
            "HoloMyth",
            "OKFAMS",
            4
        )
        questionImageList!!.add(question3)


        val question4 = Question(
            1,
            "A quién pertenece esta silueta?",
            R.drawable.pregunta_cuatro,
            "Watame",
            "Lamy",
            "Nene",
            "Botan",
            1
        )
        questionImageList!!.add(question4)

        val question5 = Question(
            1,
            "En un vídeo que Watame subió para supuestamente disculparse por algo, dijo lo " +
                    "siguiente… ¿Por qué se iba a disculpar? ",
            R.drawable.pregunta_cinco,
            "Por enfadarse y cerrar el directo al perder en un juego",
            "Porque su internet era muy malo y tenía cortes de conexión",
            "Porque hacía muy pocos directos",
            "Porque sus directos eran muy cortos",
            2
        )
        questionImageList!!.add(question5)

        val question6 = Question(
            1,
            "¿Cómo se llamaba el noticiario que Kiryu Coco hacía?",
            R.drawable.pregunta_seis,
            "Coco News",
            "AsaCoco Live",
            "News with Coco",
            "Coco Daily",
            2
        )
        questionImageList!!.add(question6)

        val question7 = Question(
            1,
            "¿Cómo se llama el anime semanal que hace Hololive con sus miembros?",
            R.drawable.pregunta_ocho,
            "HoloMems",
            "Holo no Animation",
            "Holo no Graffiti",
            "Hololive!",
            3
        )
        questionImageList!!.add(question7)

        val question8 = Question(
            1,
            "¿A qué se debe la abreviatura PPTenshi para referirse a Kanata?",
            R.drawable.pregunta_once,
            "Es su apellido escrito de otra forma",
            "Una abreviación de “ángel bondadoso” en japonés",
            "En su debut usó una presentación de PowerPoint para presentarse",
            "Es un mote que le pusieron sus compañeros",
            3
        )
        questionImageList!!.add(question8)

        val question9 = Question(
            1,
            "¿A que se debe el mote de “Gorilla Tenshi” para referirse a Kanata?",
            R.drawable.pregunta_doce,
            "A que se enfada con mucha facilidad.",
            "A su corpulencia",
            "A que en un directo dijo que tenía una fuerza de agarre de más de 50kg",
            "A su altura",
            3
        )
        questionImageList!!.add(question9)

        val question10 = Question(
            1,
            "¿Cuál es una burla amistosa que se le hace recurrentemente a Towa?",
            R.drawable.pregunta_trece,
            "Que, a pesar de ser un demonio, es incapaz de cometer maldades",
            "Suele morir con facilidad en los juegos",
            "Cuando se pone a hablar se desconcentra y se olvida de lo que está haciendo",
            "Que siempre está gastando bromas a los demás miembros",
            1
        )
        questionImageList!!.add(question10)

        val question11 = Question(
            1,
            "En un directo, Pekora le enseñó sus videos a un familiar… ¿quién era?",
            R.drawable.pregunta_catorce,
            "Su tía",
            "Su hermana",
            "Su madre",
            "Su amiga",
            3
        )
        questionImageList!!.add(question11)

        val question12 = Question(
            1,
            "¿Qué edad afirma tener Marine cada vez que le preguntan?",
            R.drawable.pregunta_quince,
            "20",
            "21",
            "17",
            "19",
            3
        )
        questionImageList!!.add(question12)

        val question13 = Question(
            1,
            "¿Qué edad afirma tener Marine cada vez que le preguntan?",
            R.drawable.bossy,
            "20",
            "21",
            "17",
            "19",
            3
        )
        questionImageList!!.add(question13)



        return questionImageList as ArrayList<Question>
    }

    fun getGifQuestions(): ArrayList<Question> {
        questionGifList = ArrayList<Question>()


        val question1 = Question(
            1,
            "¿Con qué miembro de Hololive se asocia esta mascota?",
            R.drawable.pregunta_siete_gif,
            "Ayame",
            "Mio",
            "Luna",
            "Subaru",
            4
        )
        questionGifList.add(question1)

        val question2 = Question(
            1,
            "¿Qué representa Ceres Fauna?",
            R.drawable.pregunta_diez_gif,
            "Es un hada",
            "Representa la madre naturaleza",
            "Es una semi-diosa",
            "Es una gacela",
            2
        )
        questionGifList.add(question2)

        val question3 = Question(
            1,
            "¿A qué animal representa Watame?",
            R.drawable.pregunta_nueve_gif,
            "Oveja",
            "Cabra",
            "Carnero",
            "Toro",
            1
        )
        questionGifList.add(question3)


        return questionGifList
    }


    fun getFragments(): ArrayList<QuizBaseTypeFragment> {

        var listFragment = ArrayList<QuizBaseTypeFragment>()

        var fragment1 = QuizImageType()
        listFragment.add(fragment1)


        var fragment2 = QuizGifType()
        listFragment.add(fragment2)

        return listFragment
    }

}