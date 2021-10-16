package com.grupox.game_primeros_test

object Constants {

    var questionImageList: ArrayList<Question>? = null
    var questionGifList: ArrayList<Question> = ArrayList()
    var questionFourImageList: ArrayList<Question> = ArrayList()
    var questionVideoList: ArrayList<Question> = ArrayList();
    var newBackGround: String = ""
        get() {
            if (field == "") {
                return "achan_new"
            }
            return field
        }

    fun getVideoQuestion(): ArrayList<Question> {
        questionVideoList = ArrayList()

        val question1 = Question(
            id = 1,
            question = "¿Qué dos Vtubers aparecen en esta animación?",
            image = R.raw.pregunta_video_1,
            optionOne = "Marine y Pekora",
            optionTwo = "Marine y Polka",
            optionThree = "Polka y Lamy",
            optionFour = "Polka y Rushia",
            correctAnswer = 2
        )
        questionVideoList.add(question1)

        val question2 = Question(
            id = 1,
            question = "¿De qué vtuber es este saludo?",
            image = R.raw.pregunta_video_2,
            optionOne = "Uruha Rushia",
            optionTwo = "Houshou Marine",
            optionThree = "Kiryu Coco",
            optionFour = "Usada Pekora",
            correctAnswer = 4
        )
        questionVideoList.add(question2)

        val question3 = Question(
            id = 1,
            question = "¿Quién canta este cover de la canción 'Goodbye Declaration'?",
            image = R.raw.pregunta_video_3,
            optionOne = "Uruha Rushia",
            optionTwo = "Gawr Gura",
            optionThree = "Calliope Mori",
            optionFour = "Tsunomaki Watame",
            correctAnswer = 1
        )
        questionVideoList.add(question3)

        val question4 = Question(
            id = 1,
            question = "¿Quién es la protagonista de este clip?",
            image = R.raw.pregunta_video_4,
            optionOne = "Nanashi Mumei",
            optionTwo = "Nakiri Ayame",
            optionThree = "Takanashi Kiara",
            optionFour = "Fauna Ceres",
            correctAnswer = 2
        )
        questionVideoList.add(question4)

        val question5 = Question(
            id = 1,
            question = "¿Quién es la protagonista de este clip?",
            image = R.raw.pregunta_video_5,
            optionOne = "Shirogane Noel",
            optionTwo = "Shiranui Flare",
            optionThree = "Sakura Miko",
            optionFour = "Yozora Mel",
            correctAnswer = 3
        )
        questionVideoList.add(question5)

        val question6 = Question(
            id = 1,
            question = "En este meme, ¿cuál es la canción que se usa de base?",
            image = R.raw.pregunta_video_6,
            optionOne = "Before I knew you",
            optionTwo = "Somebody that I used to know",
            optionThree = "I know You too well",
            optionFour = "Someone I knew",
            correctAnswer = 2
        )
        questionVideoList.add(question6)

        val question7 = Question(
            id = 1,
            question = "En esta animación, ¿a qué juego estaban jugando Korone y Calliope?",
            image = R.raw.pregunta_video_7,
            optionOne = "Keep Talking and Nobody Explodes",
            optionTwo = "Minecraft",
            optionThree = "1-2-Switch",
            optionFour = "Mario Party",
            correctAnswer = 1
        )
        questionVideoList.add(question7)

        val question8 = Question(
            id = 1,
            question = "En esta animación, ¿a que famosa película de los 90 se hace referencia?",
            image = R.raw.pregunta_video_8,
            optionOne = "Star Wars: Episodio V - El Imperio contraataca",
            optionTwo = "Indiana Jones y la última cruzada",
            optionThree = "Terminator 2",
            optionFour = "Regreso al futuro 3",
            correctAnswer = 3
        )
        questionVideoList.add(question8)

        val question9 = Question(
            id = 1,
            question = "En esta animación, ¿quién es la protagonista?",
            image = R.raw.pregunta_video_9,
            optionOne = "Yuzuki Choco",
            optionTwo = "Oozora Subaru",
            optionThree = "Akai Haato",
            optionFour = "Omaru Polka",
            correctAnswer = 2
        )
        questionVideoList.add(question9)

        val question10 = Question(
            id = 1,
            question = "¿Quién canta esta canción original?",
            image = R.raw.pregunta_video_10,
            optionOne = "Shirakami Fubuki",
            optionTwo = "Tokoyami Towa",
            optionThree = "Shishiro Botan",
            optionFour = "Gawr Gura",
            correctAnswer = 4
        )
        questionVideoList.add(question10)

        return questionVideoList
    }

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
            question = "En el vídeo de disculpa de Watame, ¿porqué se iba a disculpar?",
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
            question = "Pekora le enseñó sus videos a un familiar… ¿quién era?",
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

        val question13 = Question(
            id = 1,
            question = "¿De que generación de Hololive es Kanata?",
            image = R.drawable.pregunta_diecisiete,
            optionOne = "Primera generación de Hololive",
            optionTwo = "Segunda generación de Hololive",
            optionThree = "Tercera generación de Hololive",
            optionFour = "Cuarta generación de Hololive",
            correctAnswer = 4
        )
        questionImageList!!.add(question13)

        val question14 = Question(
            id = 1,
            question = "La primera generación de Hololive English está formada por…",
            image = R.drawable.pregunta_dieciocho,
            optionOne = "Amelia, Gura, Ina, Calliope y Kiara",
            optionTwo = "Kanata, Coco, Luna, Towa y Watame",
            optionThree = "Fubuki, Matsuri, Mel, Aki y Akai Haato",
            optionFour = "Choco, Subaru, Ayame, Shion y Aqua",
            correctAnswer = 1
        )
        questionImageList!!.add(question14)

        val question15 = Question(
            id = 1,
            question = "El término que se usa para señalar que una Vtuber cesa sus actividades es…",
            image = R.drawable.pregunta_diecinueve,
            optionOne = "Jubilación",
            optionTwo = "Graduación",
            optionThree = "Desaparición",
            optionFour = "Finalización",
            correctAnswer = 2
        )
        questionImageList!!.add(question15)

        val question16 = Question(
            id = 1,
            question = "¿Con qué miembro de Hololive se fundó la empresa?",
            image = R.drawable.pregunta_veinte,
            optionOne = "Suisei",
            optionTwo = "Korone",
            optionThree = "Fubuki",
            optionFour = "Sora",
            correctAnswer = 4
        )
        questionImageList!!.add(question16)

        val question17 = Question(
            id = 1,
            question = "En el primer directo de Sora, ¿cuántos espectadores hubo?",
            image = R.drawable.pregunta_veintiuno,
            optionOne = "Menos de 20",
            optionTwo = "Más de 100",
            optionThree = "Más de 1000",
            optionFour = "Más de 10000",
            correctAnswer = 1
        )
        questionImageList!!.add(question17)

        val question18 = Question(
            id = 1,
            question = "¿A que compañía pertenece Pikamee?",
            image = R.drawable.pregunta_veintidos,
            optionOne = "VOMS",
            optionTwo = "Hololive",
            optionThree = "Vshojo",
            optionFour = "Nijisanji",
            correctAnswer = 1
        )
        questionImageList!!.add(question18)

        val question19 = Question(
            id = 1,
            question = "¿Qué les requisa Korone a sus espectadores?",
            image = R.drawable.pregunta_veintitres,
            optionOne = "Los dedos",
            optionTwo = "La voluntad",
            optionThree = "Las manos",
            optionFour = "Los labios",
            correctAnswer = 1
        )
        questionImageList!!.add(question19)

        val question20 = Question(
            id = 1,
            question = "El primer miebro de Hololive en hacer directos en inglés fue...",
            image = R.drawable.pregunta_veinticuatro,
            optionOne = "Kiryu Coco",
            optionTwo = "Akai Haato",
            optionThree = "Inugane Korone",
            optionFour = "Shirogane Noel",
            correctAnswer = 2
        )
        questionImageList!!.add(question20)

        val question21 = Question(
            id = 1,
            question = "¿Quién iba a ser un miembro de la primera generación de Hololive?",
            image = R.drawable.pregunta_veintiseis,
            optionOne = "Mano Aloe",
            optionTwo = "Hitomi Chris",
            optionThree = "Yuzuki Choco",
            optionFour = "Ookami Mio",
            correctAnswer = 2
        )
        questionImageList!!.add(question21)

        val question22 = Question(
            id = 1,
            question = "¿Cuáles son todas las ramas de Hololive que existen actualmente?",
            image = R.drawable.pregunta_veintisiete,
            optionOne = "Hololive China y Hololive Japan",
            optionTwo = "Hololive China, Hololive Japan, Hololive Indonesia y Hololive English",
            optionThree = "Hololive Japan y Hololive English",
            optionFour = "Hololive Japan, Hololive Indonesia y Hololive English",
            correctAnswer = 4
        )
        questionImageList!!.add(question22)

        val question23 = Question(
            id = 1,
            question = "La compañía con más miembros es…",
            image = R.drawable.pregunta_veintiocho,
            optionOne = "Nijisanji",
            optionTwo = "Vshojo",
            optionThree = "VOMS",
            optionFour = "Hololive",
            correctAnswer = 1
        )
        questionImageList!!.add(question23)

        val question24 = Question(
            id = 1,
            question = "La tercera generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_veintinueve,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            correctAnswer = 2
        )
        questionImageList!!.add(question24)

        val question25 = Question(
            id = 1,
            question = "La segunda generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treinta,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            correctAnswer = 1
        )
        questionImageList!!.add(question25)

        val question26 = Question(
            id = 1,
            question = "La primera generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treintayuno,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            correctAnswer = 4
        )
        questionImageList!!.add(question26)

        val question27 = Question(
            id = 1,
            question = "La cuarta generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treintaydos,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            correctAnswer = 3
        )
        questionImageList!!.add(question27)

        val question28 = Question(
            id = 1,
            question = "¿En qué había trabajado Watame antes de pertenecer a Hololive?",
            image = R.drawable.pregunta_treintaytres,
            optionOne = "Era profesora infantil",
            optionTwo = "Era camarera",
            optionThree = "Era escritora",
            optionFour = "Era cocinera",
            correctAnswer = 1
        )
        questionImageList!!.add(question28)

        val question29 = Question(
            id = 1,
            question = "¿Qué miembro de Hololive protagoniza una serie de cortos para niños?",
            image = R.drawable.pregunta_treintaycuatro,
            optionOne = "Botan",
            optionTwo = "Lamy",
            optionThree = "Coco",
            optionFour = "Watame",
            correctAnswer = 4
        )
        questionImageList!!.add(question29)

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

        val question4 = Question(
            id = 1,
            question = "¿De qué generación es Pekora?",
            image = R.drawable.pregunta_dieciseis_gif,
            optionOne = "Primera generación de Hololive",
            optionTwo = "Segunda generación de Hololive",
            optionThree = "Tercera generación de Hololive",
            optionFour = "Cuarta generación de Hololive",
            correctAnswer = 3
        )
        questionGifList.add(question4)

        val question5 = Question(
            id = 1,
            question = "¿Quién es la “mama” de Subaru?",
            image = R.drawable.pregunta_veinticinco_gif,
            optionOne = "Shigure Ui",
            optionTwo = "Inuyama Tamaki",
            optionThree = "Nachoneko",
            optionFour = "Nabi",
            correctAnswer = 1
        )

        questionGifList.add(question5)

        val question6 = Question(
            id = 1,
            question = "¿Cómo llama Ina a sus seguidores?",
            image = R.drawable.pregunta_treintaycinco_gif,
            optionOne = "Inan’s",
            optionTwo = "Takodachis",
            optionThree = "Octochans",
            optionFour = "Takochis",
            correctAnswer = 2
        )

        questionGifList.add(question6)

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
            question = "Selecciona a la Vtuber independiente",
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

        val fragment4 = QuizVideoType()
        listFragment.add(fragment4)

        return listFragment
    }

}