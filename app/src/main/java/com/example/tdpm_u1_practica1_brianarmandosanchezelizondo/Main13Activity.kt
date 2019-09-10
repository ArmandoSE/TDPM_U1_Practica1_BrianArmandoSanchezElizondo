package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main13Activity : AppCompatActivity() {
    var volver12 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        volver12= findViewById(R.id.volver)
        volver12?.setOnClickListener { finish() }
    }
}
