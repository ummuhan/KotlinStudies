package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycle_row.view.*
import java.util.*
import java.util.zip.Inflater
import kotlin.collections.ArrayList

class recycle_adapter(val kahramanListesi :ArrayList<String>,val kahramanResimleri:ArrayList<Bitmap>): RecyclerView.Adapter<recycle_adapter.KahramanVH>() {
    class KahramanVH(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KahramanVH {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycle_row,parent,false)
        return KahramanVH(itemView)

    }

    override fun onBindViewHolder(holder: KahramanVH, position: Int) {
        holder.itemView.recyclerViewTextView.text=kahramanListesi.get(position)
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }


}