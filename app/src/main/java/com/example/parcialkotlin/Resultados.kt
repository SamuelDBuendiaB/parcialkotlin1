package com.example.parcialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)


        mostrar()

    }

    fun mostrar(){
        var respuesta = findViewById<TextView>(R.id.resultado)
        val suma = intent.getStringExtra("suma")
        val resta = intent.getStringExtra("resta")
        val multiplicacion = intent.getStringExtra("multi")
        val divicion = intent.getStringExtra("div")

        respuesta.text = "Respuesta: suma $suma\n resta: $resta\n Multiplicacion $multiplicacion\n division $divicion\n"



    }

}