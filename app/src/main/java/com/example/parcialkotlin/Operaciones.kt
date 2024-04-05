package com.example.parcialkotlin

import android.widget.Toast

class Operaciones {
    fun suma(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun resta(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multip(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        if (num2 != 0 && num1 != 0) {
            return num1 / num2
        } else {

        }
        return TODO()
    }

}
