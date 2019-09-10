package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main6Activity : AppCompatActivity() {
    var regresar5 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        regresar5 =findViewById(R.id.volver)
        regresar5?.setOnClickListener { finish() }
    }
}
