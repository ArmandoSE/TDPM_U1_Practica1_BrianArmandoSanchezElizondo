package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main12Activity : AppCompatActivity() {
    var volver11 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        volver11= findViewById(R.id.volver)
        volver11?.setOnClickListener { finish() }
    }
}
