package com.example.contextprojesi

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences:SharedPreferences
    var alinanDeger:String ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hoşgeldiniz..", Toast.LENGTH_LONG).show()

        sharedPreferences=this.getSharedPreferences("com.example.contextprojesi", Context.MODE_PRIVATE)
        alinanDeger=sharedPreferences.getString("yazilanDeger","")
        if(alinanDeger!=null){
            textView.text="Kaydedilen isim: ${alinanDeger}"
        }
    }
    fun kaydet(view: View){
        alinanDeger=text.text.toString()
        if(alinanDeger==""){
            Toast.makeText(this, "Lütfen adınızı giriniz", Toast.LENGTH_SHORT).show()
        }
        sharedPreferences.edit().putString("yazilanDeger",alinanDeger).apply()
        textView.text="Kaydedilen kullanıcı${alinanDeger}"

    }
    fun sil(view: View){
        alinanDeger=sharedPreferences.getString("yazilanDeger","")
        if(alinanDeger!=null){
            textView.text="Kaydedilen kullanıcı:"
            sharedPreferences.edit().remove("yazilanDeger").apply()
        }else{

        }
    }
}