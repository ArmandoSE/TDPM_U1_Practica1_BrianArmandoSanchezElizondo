package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main5Activity : AppCompatActivity() {
    var regresar4 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        regresar4=findViewById(R.id.volver)

        regresar4?.setOnClickListener { finish() }
    }
}
