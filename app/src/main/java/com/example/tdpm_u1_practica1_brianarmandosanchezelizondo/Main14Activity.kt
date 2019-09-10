package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main14Activity : AppCompatActivity() {
    var volver13 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)
        volver13=findViewById(R.id.volver)
        volver13?.setOnClickListener { finish() }
    }
}
