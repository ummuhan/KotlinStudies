package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Superman")

      


        var BatmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,
                R.drawable.batman)
        var AquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,
                R.drawable.aquman)
        var SpidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,
                R.drawable.spiderman)
        var IronmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,
                R.drawable.ironman)
        var SupermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,
                R.drawable.superman)


        var superKahramanGorselleri=ArrayList<Bitmap>()
        superKahramanGorselleri.add(BatmanBitmap)
        superKahramanGorselleri.add(AquamanBitmap)
        superKahramanGorselleri.add(SpidermanBitmap)
        superKahramanGorselleri.add(IronmanBitmap)
        superKahramanGorselleri.add(SupermanBitmap)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter=recycle_adapter(superKahramanIsimleri,superKahramanGorselleri)
        recyclerView.adapter=adapter
    }
}