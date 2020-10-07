package com.example.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view:View){
        val isim=isimText.text.toString()
        val meslek=meslekText.text.toString()
        val yas=yasText.text.toString().toIntOrNull()
        if(yas==null){
            textView.text="Doğru yaşı giriniz."
        }else{
val superKahraman=SuperKahraman(isim, meslek, yas)
        textView.text="İsim:${superKahraman.isim} Meslek ${superKahraman.meslek} Yaş ${superKahraman.yas}"

    }} 

}