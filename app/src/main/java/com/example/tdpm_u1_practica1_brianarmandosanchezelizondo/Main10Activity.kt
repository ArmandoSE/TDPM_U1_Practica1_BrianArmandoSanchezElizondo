package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main10Activity : AppCompatActivity() {
    var volver9 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        volver9= findViewById(R.id.volver)
        volver9?.setOnClickListener { finish() }
    }
}
