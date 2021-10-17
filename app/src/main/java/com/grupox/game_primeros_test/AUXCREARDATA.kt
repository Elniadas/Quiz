package com.grupox.game_primeros_test

import android.os.Debug
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.grupox.game_primeros_test.bd.Pregunta
import com.grupox.game_primeros_test.bd.PreguntaViewModel
import com.grupox.game_primeros_test.bd.PreguntasDataBase

object AUXCREARDATA {


    const val IMAGE = "Image"
    const val GIF = "Gif"
    const val FOURIMAGE = "FourImage"
    var PreguntaImageList: ArrayList<Pregunta>? = null
    var PreguntaGifList: ArrayList<Pregunta> = ArrayList()
    var PreguntaFourImageList: ArrayList<Pregunta> = ArrayList()
    private lateinit var _PreguntaViewModer: PreguntaViewModel
    lateinit var mViewModel: PreguntaViewModel


    fun inicializar (app: AppCompatActivity){
        mViewModel= ViewModelProvider(app).get(PreguntaViewModel::class.java)
    }

    fun getImagePreguntas(): ArrayList<Pregunta> {

        PreguntaImageList = ArrayList()

        val Pregunta1 = Pregunta(
            id = 1,
            question = "¿Qué dice Tomoshika en inglés que hace que Pikamee estalle de risa?",
            image = R.drawable.pregunta_uno,
            optionOne = "Let’s get some b*tches",
            optionTwo = "Let’s kill da h*e",
            optionThree = "Let’s go moth*rfuck*r",
            optionFour = "Let’s f*ck",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta1)

        val Pregunta2 = Pregunta(
            id = 1,
            question = "¿Por qué se hizo famoso este clip de Sakura Miko?",
            image = R.drawable.pregunta_dos,
            optionOne = "El juego se crashea y Miko llora",
            optionTwo = "El directo se corta de golpe porque se le va la luz",
            optionThree = "Miko, sin saber lo que significa, dice Nig*a de forma melódica ",
            optionFour = "Ella pensando que está silenciada se pone a hablar de cosas personales",
            type = IMAGE,
            correctAnswer = 3
        )

        PreguntaImageList!!.add(Pregunta2)

        val Pregunta3 = Pregunta(
            id = 1,
            question = "¿Cómo se conoce a esta agrupación de miembros de Hololive?",
            image = R.drawable.pregunta_tres,
            optionOne = "Hololive Gamers",
            optionTwo = "Hololive SuperStars",
            optionThree = "HoloMyth",
            optionFour = "OKFAMS",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta3)


        val Pregunta4 = Pregunta(
            id = 1,
            question = "A quién pertenece esta silueta?",
            image = R.drawable.pregunta_cuatro,
            optionOne = "Watame",
            optionTwo = "Lamy",
            optionThree = "Nene",
            optionFour = "Botan",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta4)

        val Pregunta5 = Pregunta(
            id = 1,
            question = "En el vídeo de disculpa de Watame, ¿porqué se iba a disculpar?",
            image = R.drawable.pregunta_cinco,
            optionOne = "Por enfadarse y cerrar el directo al perder en un juego",
            optionTwo = "Porque su internet era muy malo y tenía cortes de conexión",
            optionThree = "Porque hacía muy pocos directos",
            optionFour = "Porque sus directos eran muy cortos",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta5)

        val Pregunta6 = Pregunta(
            id = 1,
            question = "¿Cómo se llamaba el noticiario que Kiryu Coco hacía?",
            image = R.drawable.pregunta_seis,
            optionOne = "Coco News",
            optionTwo = "AsaCoco Live",
            optionThree = "News with Coco",
            optionFour = "Coco Daily",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta6)

        val Pregunta7 = Pregunta(
            id = 1,
            question = "¿Cómo se llama el anime semanal que hace Hololive con sus miembros?",
            image = R.drawable.pregunta_ocho,
            optionOne = "HoloMems",
            optionTwo = "Holo no Animation",
            optionThree = "Holo no Graffiti",
            optionFour = "Hololive!",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta7)

        val Pregunta8 = Pregunta(
            id = 1,
            question = "¿A qué se debe la abreviatura PPTenshi para referirse a Kanata?",
            image = R.drawable.pregunta_once,
            optionOne = "Es su apellido escrito de otra forma",
            optionTwo = "Una abreviación de “ángel bondadoso” en japonés",
            optionThree = "En su debut usó una presentación de PowerPoint para presentarse",
            optionFour = "Es un mote que le pusieron sus compañeros",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta8)

        val Pregunta9 = Pregunta(
            id = 1,
            question = "¿A que se debe el mote de “Gorilla Tenshi” para referirse a Kanata?",
            image = R.drawable.pregunta_doce,
            optionOne = "A que se enfada con mucha facilidad.",
            optionTwo = "A su corpulencia",
            optionThree = "A que en un directo dijo que tenía una fuerza de agarre de más de 50kg",
            optionFour = "A su altura",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta9)

        val Pregunta10 = Pregunta(
            id = 1,
            question = "¿Cuál es una burla amistosa que se le hace recurrentemente a Towa?",
            image = R.drawable.pregunta_trece,
            optionOne = "Que, a pesar de ser un demonio, es incapaz de cometer maldades",
            optionTwo = "Suele morir con facilidad en los juegos",
            optionThree = "Cuando se pone a hablar se desconcentra y se olvida de lo que está haciendo",
            optionFour = "Que siempre está gastando bromas a los demás miembros",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta10)

        val Pregunta11 = Pregunta(
            id = 1,
            question = "Pekora le enseñó sus videos a un familiar… ¿quién era?",
            image = R.drawable.pregunta_catorce,
            optionOne = "Su tía",
            optionTwo = "Su hermana",
            optionThree = "Su madre",
            optionFour = "Su amiga",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta11)

        val Pregunta12 = Pregunta(
            id = 1,
            question = "¿Qué edad afirma tener Marine cada vez que le preguntan?",
            image = R.drawable.pregunta_quince,
            optionOne = "20",
            optionTwo = "21",
            optionThree = "17",
            optionFour = "19",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta12)

        val Pregunta13 = Pregunta(
            id = 1,
            question = "¿De que generación de Hololive es Kanata?",
            image = R.drawable.pregunta_diecisiete,
            optionOne = "Primera generación de Hololive",
            optionTwo = "Segunda generación de Hololive",
            optionThree = "Tercera generación de Hololive",
            optionFour = "Cuarta generación de Hololive",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta13)

        val Pregunta14 = Pregunta(
            id = 1,
            question = "La primera generación de Hololive English está formada por…",
            image = R.drawable.pregunta_dieciocho,
            optionOne = "Amelia, Gura, Ina, Calliope y Kiara",
            optionTwo = "Kanata, Coco, Luna, Towa y Watame",
            optionThree = "Fubuki, Matsuri, Mel, Aki y Akai Haato",
            optionFour = "Choco, Subaru, Ayame, Shion y Aqua",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta14)

        val Pregunta15 = Pregunta(
            id = 1,
            question = "El término que se usa para señalar que una Vtuber cesa sus actividades es…",
            image = R.drawable.pregunta_diecinueve,
            optionOne = "Jubilación",
            optionTwo = "Graduación",
            optionThree = "Desaparición",
            optionFour = "Finalización",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta15)

        val Pregunta16 = Pregunta(
            id = 1,
            question = "¿Con qué miembro de Hololive se fundó la empresa?",
            image = R.drawable.pregunta_veinte,
            optionOne = "Suisei",
            optionTwo = "Korone",
            optionThree = "Fubuki",
            optionFour = "Sora",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta16)

        val Pregunta17 = Pregunta(
            id = 1,
            question = "En el primer directo de Sora, ¿cuántos espectadores hubo?",
            image = R.drawable.pregunta_veintiuno,
            optionOne = "Menos de 20",
            optionTwo = "Más de 100",
            optionThree = "Más de 1000",
            optionFour = "Más de 10000",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta17)

        val Pregunta18 = Pregunta(
            id = 1,
            question = "¿A que compañía pertenece Pikamee?",
            image = R.drawable.pregunta_veintidos,
            optionOne = "VOMS",
            optionTwo = "Hololive",
            optionThree = "Vshojo",
            optionFour = "Nijisanji",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta18)

        val Pregunta19 = Pregunta(
            id = 1,
            question = "¿Qué les requisa Korone a sus espectadores?",
            image = R.drawable.pregunta_veintitres,
            optionOne = "Los dedos",
            optionTwo = "La voluntad",
            optionThree = "Las manos",
            optionFour = "Los labios",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta19)

        val Pregunta20 = Pregunta(
            id = 1,
            question = "El primer miebro de Hololive en hacer directos en inglés fue...",
            image = R.drawable.pregunta_veinticuatro,
            optionOne = "Kiryu Coco",
            optionTwo = "Akai Haato",
            optionThree = "Inugane Korone",
            optionFour = "Shirogane Noel",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta20)

        val Pregunta21 = Pregunta(
            id = 1,
            question = "¿Quién iba a ser un miembro de la primera generación de Hololive?",
            image = R.drawable.pregunta_veintiseis,
            optionOne = "Mano Aloe",
            optionTwo = "Hitomi Chris",
            optionThree = "Yuzuki Choco",
            optionFour = "Ookami Mio",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta21)

        val Pregunta22 = Pregunta(
            id = 1,
            question = "¿Cuáles son todas las ramas de Hololive que existen actualmente?",
            image = R.drawable.pregunta_veintisiete,
            optionOne = "Hololive China y Hololive Japan",
            optionTwo = "Hololive China, Hololive Japan, Hololive Indonesia y Hololive English",
            optionThree = "Hololive Japan y Hololive English",
            optionFour = "Hololive Japan, Hololive Indonesia y Hololive English",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta22)

        val Pregunta23 = Pregunta(
            id = 1,
            question = "La compañía con más miembros es…",
            image = R.drawable.pregunta_veintiocho,
            optionOne = "Nijisanji",
            optionTwo = "Vshojo",
            optionThree = "VOMS",
            optionFour = "Hololive",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta23)

        val Pregunta24 = Pregunta(
            id = 1,
            question = "La tercera generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_veintinueve,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            type = IMAGE,
            correctAnswer = 2
        )
        PreguntaImageList!!.add(Pregunta24)

        val Pregunta25 = Pregunta(
            id = 1,
            question = "La segunda generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treinta,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta25)

        val Pregunta26 = Pregunta(
            id = 1,
            question = "La primera generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treintayuno,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta26)

        val Pregunta27 = Pregunta(
            id = 1,
            question = "La cuarta generación de Hololive está compuesta por…",
            image = R.drawable.pregunta_treintaydos,
            optionOne = "Aqua, Ayame, Choco, Subaru y Shion",
            optionTwo = "Rushia, Marine, Pekora, Noel y Flare",
            optionThree = "Watame, Luna, Coco, Towa y Kanata",
            optionFour = "Fubuki, Matsuri, Aki, Mel y Akai Haato",
            type = IMAGE,
            correctAnswer = 3
        )
        PreguntaImageList!!.add(Pregunta27)

        val Pregunta28 = Pregunta(
            id = 1,
            question = "¿En qué había trabajado Watame antes de pertenecer a Hololive?",
            image = R.drawable.pregunta_treintaytres,
            optionOne = "Era profesora infantil",
            optionTwo = "Era camarera",
            optionThree = "Era escritora",
            optionFour = "Era cocinera",
            type = IMAGE,
            correctAnswer = 1
        )
        PreguntaImageList!!.add(Pregunta28)

        val Pregunta29 = Pregunta(
            id = 1,
            question = "¿Qué miembro de Hololive protagoniza una serie de cortos para niños?",
            image = R.drawable.pregunta_treintaycuatro,
            optionOne = "Botan",
            optionTwo = "Lamy",
            optionThree = "Coco",
            optionFour = "Watame",
            type = IMAGE,
            correctAnswer = 4
        )
        PreguntaImageList!!.add(Pregunta29)

        return PreguntaImageList as ArrayList<Pregunta>
    }

    fun getGifPreguntas(): ArrayList<Pregunta> {
        PreguntaGifList = ArrayList()


        val Pregunta1 = Pregunta(
            id = 1,
            question = "¿Con qué miembro de Hololive se asocia esta mascota?",
            image = R.drawable.pregunta_siete_gif,
            optionOne = "Ayame",
            optionTwo = "Mio",
            optionThree = "Luna",
            optionFour = "Subaru",
            type = GIF,
            correctAnswer = 4
        )
        PreguntaGifList.add(Pregunta1)

        val Pregunta2 = Pregunta(
            id = 1,
            question = "¿Qué representa Ceres Fauna?",
            image = R.drawable.pregunta_diez_gif,
            optionOne = "Es un hada",
            optionTwo = "Representa a la madre naturaleza",
            optionThree = "Es una semi-diosa",
            optionFour = "Es una gacela",
            type = GIF,
            correctAnswer = 2
        )
        PreguntaGifList.add(Pregunta2)

        val Pregunta3 = Pregunta(
            id = 1,
            question = "¿A qué animal representa Watame?",
            image = R.drawable.pregunta_nueve_gif,
            optionOne = "Oveja",
            optionTwo = "Cabra",
            optionThree = "Carnero",
            optionFour = "Toro",
            type = GIF,
            correctAnswer = 1
        )
        PreguntaGifList.add(Pregunta3)

        val Pregunta4 = Pregunta(
            id = 1,
            question = "¿De qué generación es Pekora?",
            image = R.drawable.pregunta_dieciseis_gif,
            optionOne = "Primera generación de Hololive",
            optionTwo = "Segunda generación de Hololive",
            optionThree = "Tercera generación de Hololive",
            optionFour = "Cuarta generación de Hololive",
            type = GIF,
            correctAnswer = 3
        )
        PreguntaGifList.add(Pregunta4)

        val Pregunta5 = Pregunta(
            id = 1,
            question = "¿Quién es la “mama” de Subaru?",
            image = R.drawable.pregunta_veinticinco_gif,
            optionOne = "Shigure Ui",
            optionTwo = "Inuyama Tamaki",
            optionThree = "Nachoneko",
            optionFour = "Nabi",
            type = GIF,
            correctAnswer = 1
        )

        PreguntaGifList.add(Pregunta5)

        val Pregunta6 = Pregunta(
            id = 1,
            question = "¿Cómo llama Ina a sus seguidores?",
            image = R.drawable.pregunta_treintaycinco_gif,
            optionOne = "Inan’s",
            optionTwo = "Takodachis",
            optionThree = "Octochans",
            optionFour = "Takochis",
            type = GIF,
            correctAnswer = 2
        )

        PreguntaGifList.add(Pregunta6)

        return PreguntaGifList
    }

    fun getFourImagePreguntas(): ArrayList<Pregunta> {
        PreguntaFourImageList = ArrayList()

        val Pregunta1 = Pregunta(
            id = 1,
            question = "Selecciona a Nakiri Ayame",
            image = R.drawable.pregunta_opciones_1_1,
            image2 = R.drawable.pregunta_opciones_1_2,
            image3 = R.drawable.pregunta_opciones_1_3,
            image4 = R.drawable.pregunta_opciones_1_4,
            type = FOURIMAGE,
            correctAnswer = 1
        )
        PreguntaFourImageList.add(Pregunta1)

        val Pregunta2 = Pregunta(
            id = 1,
            question = "Selecciona la imagen que no se corresponda con un miembro de HoloLive",
            image = R.drawable.pregunta_opciones_2_1,
            image2 = R.drawable.pregunta_opciones_2_2,
            image3 = R.drawable.pregunta_opciones_2_3,
            image4 = R.drawable.pregunta_opciones_2_4,
            type = FOURIMAGE,
            correctAnswer = 3
        )
        PreguntaFourImageList.add(Pregunta2)
        val Pregunta3 = Pregunta(
            id = 1,
            question = "Selecciona la imagen que se corresponda con un miembro de Hololive Indonesia",
            image = R.drawable.pregunta_opciones_3_1,
            image2 = R.drawable.pregunta_opciones_3_2,
            image3 = R.drawable.pregunta_opciones_3_3,
            image4 = R.drawable.pregunta_opciones_3_4,
            type = FOURIMAGE,
            correctAnswer = 2
        )
        PreguntaFourImageList.add(Pregunta3)
        val Pregunta4 = Pregunta(
            id = 1,
            question = "Selecciona a la Vtuber independiente",
            image = R.drawable.pregunta_opciones_4_1,
            image2 = R.drawable.pregunta_opciones_4_2,
            image3 = R.drawable.pregunta_opciones_4_3,
            image4 = R.drawable.pregunta_opciones_4_4,
            type = FOURIMAGE,
            correctAnswer = 3
        )
        PreguntaFourImageList.add(Pregunta4)
        val Pregunta5 = Pregunta(
            id = 1,
            question = "Selecciona la imagen que se corresponda con un miembro de Hololive Gamers:",
            image = R.drawable.pregunta_opciones_5_1,
            image2 = R.drawable.pregunta_opciones_5_2,
            image3 = R.drawable.pregunta_opciones_5_3,
            image4 = R.drawable.pregunta_opciones_5_4,
            type = FOURIMAGE,
            correctAnswer = 1
        )
        PreguntaFourImageList.add(Pregunta5)


        return PreguntaFourImageList

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


    fun createALLPregunta(app: AppCompatActivity) {
//
//        var lista1 = getImagePreguntas()
//        var lista2 = getFourImagePreguntas()
//        var lista3 = getGifPreguntas()

//        val Pregunta5 = Pregunta(
//            id = 0,
//            Pregunta = "Selecciossna la imagsssen que se cordasd12responda con un miembro de Hololive Gamers:",
//            image = R.drawable.pregunta_opciones_3_1,
//            image2 = R.drawable.pregunta_opciones_5_2,
//            image3 = R.drawable.pregunta_opciones_2_3,
//            image4 = R.drawable.pregunta_opciones_5_4,
//            correctAnswer = 3
//        )
////
//        var s = ViewModelProvider(app).get(PreguntaViewModel::class.java)
//        s.addUser(Pregunta5)
//        Toast.makeText(app,"Compelted",Toast.LENGTH_LONG).show()
//        Log.d("","ASDasdasdqwdSDadwdqs")


    }

    
    fun createBASEDATA(){
        
        
        var lista1 = getImagePreguntas()
        var lista2 = getFourImagePreguntas()
        var lista3 = getGifPreguntas()

        var i =0
      lista1.forEach {
          it.id=i
          i++
          Log.i("pregunta1: ",it.toString())
          mViewModel.addPregunta(it)
      }
        lista2.forEach {
            it.id=i
            i++
            Log.i("pregunta2: ",it.toString())
            mViewModel.addPregunta(it)
        }
        lista3.forEach {
            it.id=i
            i++
            Log.i("pregunta3: ",it.toString())
            mViewModel.addPregunta(it)
        }
        
        
    }
    

    fun axus(app: AppCompatActivity) {



        val Pregunta5 = Pregunta(
            id = 0,
            question = "Selecciossna la imagsssen que se cordasd12responda con un miembro de Hololive Gamers:",
            image = R.drawable.pregunta_opciones_3_1,
            image2 = R.drawable.pregunta_opciones_5_2,
            image3 = R.drawable.pregunta_opciones_2_3,
            image4 = R.drawable.pregunta_opciones_5_4,
            type = "gasd",
            correctAnswer = 3
        )



        mViewModel.addPregunta(Pregunta5)

        mViewModel.readAllData.observe(app, Observer { pregunta -> Log.i("LEEE", pregunta.toString()) })

    }


}