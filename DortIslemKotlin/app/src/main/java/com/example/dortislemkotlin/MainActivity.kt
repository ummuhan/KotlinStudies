package com.example.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view:View){
        val ilkSayi=editTextTextPersonName.text.toString().toIntOrNull()
        val ikinciSayi=editTextTextPersonName2.text.toString().toIntOrNull()

        if(ilkSayi==null||ikinciSayi==null){
            textView.text="Sayı girmeyi unutmayınız."
        }else{
            val sonuc=ilkSayi + ikinciSayi
            textView.text="SONUÇ: ${sonuc}"
        }

    }
    fun cikar(view:View){
        val ilkSayi=editTextTextPersonName.text.toString().toIntOrNull()
        val ikinciSayi=editTextTextPersonName2.text.toString().toIntOrNull()

        if(ilkSayi==null||ikinciSayi==null){
            textView.text="Sayı girmeyi unutmayınız."
        }else{
            val sonuc=ilkSayi - ikinciSayi
            textView.text="SONUÇ: ${sonuc}"
        }

    }
    fun bol(view:View){
        val ilkSayi=editTextTextPersonName.text.toString().toDoubleOrNull()
        val ikinciSayi=editTextTextPersonName2.text.toString().toDoubleOrNull()

        if(ilkSayi==null||ikinciSayi==null){
            textView.text="Sayı girmeyi unutmayınız."
        }else{
            val sonuc=ilkSayi / ikinciSayi
            textView.text="SONUÇ: ${sonuc}"
        }

    }
    fun carp(view:View){
        val ilkSayi=editTextTextPersonName.text.toString().toIntOrNull()
        val ikinciSayi=editTextTextPersonName2.text.toString().toIntOrNull()

        if(ilkSayi==null||ikinciSayi==null){
            textView.text="Sayı girmeyi unutmayınız."
        }else{
            val sonuc=ilkSayi * ikinciSayi
            textView.text="SONUÇ: ${sonuc}"
        }

    }
}