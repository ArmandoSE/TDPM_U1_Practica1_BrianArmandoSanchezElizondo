package com.example.tdpm_u1_practica1_brianarmandosanchezelizondo

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var f1 : ImageButton?=null
    var f2 : ImageButton?=null
    var f3 : ImageButton?=null
    var f4 : ImageButton?=null
    var f5 : ImageButton?=null
    var f6 : ImageButton?=null
    var f7 : ImageButton?=null
    var f8 : ImageButton?=null
    var f9 : ImageButton?=null
    var f10 : ImageButton?=null
    var f11 : ImageButton?=null
    var f12 : ImageButton?=null
    var f13 : ImageButton?=null
    var f14 : ImageButton?=null
    var f15 : ImageButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        f1 = findViewById(R.id.img1)
        f1?.setOnClickListener {
            val cambiap = Intent(this,Main2Activity::class.java)
            startActivity(cambiap)
        }
        f2 = findViewById(R.id.img2)
        f2?.setOnClickListener {
            val cambiap2 = Intent(this,Main3Activity::class.java)
            startActivity(cambiap2)
        }
        f3 = findViewById(R.id.img3)
        f3?.setOnClickListener {
            val cambiap3 = Intent(this,Main4Activity::class.java)
            startActivity(cambiap3)
        }
        f4 = findViewById(R.id.img4)
        f4?.setOnClickListener {
            val cambiap4 = Intent(this,Main5Activity::class.java)
            startActivity(cambiap4)
        }
        f5 = findViewById(R.id.img5)
        f5?.setOnClickListener {
            val cambiap5 = Intent(this,Main6Activity::class.java)
            startActivity(cambiap5)
        }
        f6 = findViewById(R.id.img6)
        f6?.setOnClickListener {
            val cambiap6 = Intent(this,Main7Activity::class.java)
            startActivity(cambiap6)
        }
        f7 = findViewById(R.id.img7)
        f7?.setOnClickListener {
            val cambiap7 = Intent(this,Main8Activity::class.java)
            startActivity(cambiap7)
        }
        f8 = findViewById(R.id.img8)
        f8?.setOnClickListener {
            val cambiap8 = Intent(this,Main9Activity::class.java)
            startActivity(cambiap8)
        }
        f9 = findViewById(R.id.img9)
        f9?.setOnClickListener {
            val cambiap9 = Intent(this,Main10Activity::class.java)
            startActivity(cambiap9)
        }
        f10 = findViewById(R.id.img10)
        f10?.setOnClickListener {
            val cambiap10 = Intent(this,Main11Activity::class.java)
            startActivity(cambiap10)
        }
        f11 = findViewById(R.id.img11)
        f11?.setOnClickListener {
            val cambiap12 = Intent(this,Main12Activity::class.java)
            startActivity(cambiap12)
        }
        f12 = findViewById(R.id.img12)
        f12?.setOnClickListener {
            val cambiap12 = Intent(this,Main13Activity::class.java)
            startActivity(cambiap12)
        }
        f13 = findViewById(R.id.img13)
        f13?.setOnClickListener {
            val cambiap13 = Intent(this,Main14Activity::class.java)
            startActivity(cambiap13)
        }
        f14 = findViewById(R.id.img14)
        f14?.setOnClickListener {
            val cambiap14 = Intent(this,Main15Activity::class.java)
            startActivity(cambiap14)
        }
        f15 = findViewById(R.id.img15)
        f15?.setOnClickListener {
            val cambiap15 = Intent(this,Main16Activity::class.java)
            startActivity(cambiap15)
        }
    }
}
