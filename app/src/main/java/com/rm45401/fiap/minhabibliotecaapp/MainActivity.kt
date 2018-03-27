package com.rm45401.fiap.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rm45401.fiap.minhabiblioteca.Calculadora
import com.rm45401.fiap.minhabiblioteca.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = Calculadora().somar(1, 2)
        val customToast = CustomToast().showToast(this, "ADOLETA!")
    }
}
