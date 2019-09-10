package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main4Activity : AppCompatActivity() {
    var regresar2 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        regresar2=findViewById(R.id.volver)
        regresar2?.setOnClickListener {
            finish()
        }
    }
}
