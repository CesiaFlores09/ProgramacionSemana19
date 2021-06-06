package com.example.programacionsemana19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class PasarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasar_datos)

        val bundle=intent.extras
        val tvMostrar1 = findViewById<TextView>(R.id.tvMostrar)

        tvMostrar1.text=bundle?.getString("dt")

        val btnVolver=findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }

    }


}