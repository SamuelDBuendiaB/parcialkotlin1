package com.example.parcialkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculadora()
    }

    fun calculadora(){
        val operacion = Operaciones();
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var sum = findViewById<Button>(R.id.suma)



        sum.setOnClickListener{
            var ad1 = num1.text.toString().toInt()
            var ad2 = num2.text.toString().toInt()
            var resultado = operacion.suma(ad1, ad2)
            var resultado2 = operacion.resta(ad1, ad2)
            var resultado3 = operacion.multip(ad1, ad2)
            var resultado4 = operacion.divide(ad1, ad2)

            val inten = Intent(this,Resultados::class.java)
            inten.putExtra("suma",resultado)
            inten.putExtra("resta",resultado2)
            inten.putExtra("multi",resultado3)
            inten.putExtra("div",resultado4)
            startActivity(inten)
        }


    }

}