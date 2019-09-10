package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main16Activity : AppCompatActivity() {
    var volver15 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)
        volver15=findViewById(R.id.volver)
        volver15?.setOnClickListener { finish() }
    }
}
