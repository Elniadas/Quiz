package com.grupox.game_primeros_test

data class Vtuber(val image: Int, val name: String)

object Vtubers {

    private val images = intArrayOf(
        R.drawable.achan_head,
        R.drawable.aki_head,
        R.drawable.aloe_head,
        R.drawable.ame_head,
        R.drawable.anya_head,
        R.drawable.aqua_head,
        R.drawable.azki_head,
        R.drawable.botan_head,
        R.drawable.calliope_head,
        R.drawable.ina_head,
        R.drawable.iofi_head,
        R.drawable.kanata_head,
        R.drawable.kiara_head,
        R.drawable.miko_head,
        R.drawable.mio_head,
        R.drawable.moona_head,
        R.drawable.risu_head,
        R.drawable.rushia_head,
        R.drawable.shion_head
    )

    private val names = arrayOf(
        "Achan",
        "Aki",
        "Aloe",
        "Ame",
        "Anya",
        "Aqua",
        "Azki",
        "Botan",
        "Calli",
        "Ina",
        "Iofi",
        "Kanata",
        "Kiara",
        "Miko",
        "Mio",
        "Moona",
        "Risu",
        "Rushia",
        "Shion"
    )

    var list: ArrayList<Vtuber>? = null
        get() {

            if (field != null)
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]
                val vtuberName = names[i]

                val vtuber = Vtuber(imageId, vtuberName)
                field!!.add(vtuber)
            }

            return field
        }

    fun changeFirtsItem(newPos: Int) {
        var vtuberNuevo = list!![newPos]
        list!![newPos] = list!![0]
        list!![0] = vtuberNuevo
    }
}
