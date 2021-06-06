package com.example.programacionsemana19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bSiguiente=findViewById<Button>(R.id.btnEnviar)
        var dato=findViewById< TextView>(R.id.etDato)
        bSiguiente.setOnClickListener {
            Toast.makeText(this,"Clic en el boton", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity,PasarDatos::class.java)


            var dato1 :String= dato.text.toString()
            val b :Bundle= Bundle()

            b.putString("dt",dato1)
            intent.putExtras(b)
            startActivity(intent)
        }
    }


}