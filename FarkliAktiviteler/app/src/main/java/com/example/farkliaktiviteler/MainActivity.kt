package com.example.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun aktiviteDegistir(view: View){
        val alinanVeri=girisText.text.toString()
        val intent=Intent(applicationContext,IkinciAktivite::class.java)
        intent.putExtra("gonderilenVeri",alinanVeri)
        startActivity(intent)
    }
}