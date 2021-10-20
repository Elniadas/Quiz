package com.grupox.game_primeros_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_set_name.*

class Set_Name : AppCompatActivity() {

    var primera = true;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_name)
        primera = true

        startUi()

        val builder = AlertDialog.Builder(this)




        bt_empezar.setOnClickListener {
            if (et_set_user_name_feo.text.toString().isEmpty()) {
                if (primera == true) {
                    builder.setTitle("No has insertado nombre de usuario")
                    builder.setMessage("Si no pones usuario no guardaras la clasificacion")
                    builder.show()
                    primera = false

                }else{
                    LoadData.prefs.name=""
                    val intent = Intent(this, QuizFragments::class.java)
                    startActivity(intent)
                    finish()
                }
            }else {
                LoadData.prefs.name=et_set_user_name_feo.text.toString()
                val intent = Intent(this, QuizFragments::class.java)
                startActivity(intent)
                finish()

            }


        }


    }



    private fun startUi(){
        if(LoadData.prefs.name.isNotEmpty()){
            et_set_user_name_feo.setText(LoadData.prefs.name)
        }
    }
}