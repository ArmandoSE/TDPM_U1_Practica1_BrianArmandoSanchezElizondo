package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main11Activity : AppCompatActivity() {
    var volver10 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        volver10= findViewById(R.id.volver)
        volver10?.setOnClickListener { finish() }
    }
}
