package com.example.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contextkullanimi.databinding.ActivityMainBinding

//Context içinde bulunduğumuz activityden bir parça
//Kullanılan bazı yapılar context girmemizi bekler(yani activitymizden bir parça bekler
class MainActivity : AppCompatActivity() {
    private lateinit var bindiing: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindiing = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        bindiing.button.setOnClickListener {
            /*
            //1.kullanım this
            Toast.makeText(this,"Merhaba",Toast.LENGTH_SHORT).show()
            //2.kullanım
            Toast.makeText(this@MainActivity,"Merhaba",Toast.LENGTH_SHORT).show()

             */
            //3.kullanım şekli
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_SHORT).show()
        }
    }
}