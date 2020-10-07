package com.example.classexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun sinifCalismasi(view: View) {
        var superman=SuperKahraman()
        superman.isim="Superman"
        superman.meslek="Gazeteci"
        superman.yas=35
        textView.text="Super kahraman: ${superman.isim}"
    }
}