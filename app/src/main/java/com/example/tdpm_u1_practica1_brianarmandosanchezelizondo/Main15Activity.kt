package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class Main15Activity : AppCompatActivity() {
    var volver14 : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
        volver14=findViewById(R.id.volver)
        volver14?.setOnClickListener { finish() }
    }
}
