package com.example.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas",0)//burada default değer belirtmemiz
        val gelenBoy = intent.getDoubleExtra("boy",0.0)

        Log.e("Mesaj",gelenMesaj.toString())
        Log.e("Mesaj",gelenYas.toString())
        Log.e("Mesaj" ,gelenBoy.toString())

        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler

        Log.e("Kişi tcno",(gelenKisi.tcno).toString())
        Log.e("Kişi isim",(gelenKisi.isim))
        Log.e("Kisi Boy ",(gelenKisi.boy).toString())
    }
}