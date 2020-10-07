package com.example.handlerrunableprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayac=0
    var runnable:Runnable= Runnable {  }
    var handler=Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun baslat(view:View){
        sayac=0
      runnable=object :Runnable{
          override fun run() {
              sayac=sayac+1
              textView.text="Sayac:${sayac}"
              handler.postDelayed(runnable,1000)
          }

      }
        handler.post(runnable)

    }
    fun durdur(view: View){
handler.removeCallbacks(runnable)
        sayac=0
        textView.text="Sayaç=0"
    }
}