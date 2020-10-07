package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)
        val intent=intent
        val alinanVeri=intent.getStringExtra("gonderilenVeri")
        textView.text=alinanVeri
    }
}