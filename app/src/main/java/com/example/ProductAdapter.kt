package com.example


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapplication.R

class ProductAdapter(private val mList: List<Products>) :
    RecyclerView.Adapter<ProductAdapter, ViewHolder> {


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = ItemView.findViewById(R.id.imageView)
        val textView: TextView = ItemView.findViewById(R.id.textView)

    }
}