package com.example.notesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//import androidx.room.processor.Context

class MyAdapter(val ctx: Context, val myDataList:List<MyData>):BaseAdapter() {
    override fun getCount(): Int {
        TODO("Not yet implemented")
        return myDataList.size
    }

    override fun getItem(position: Int): MyData {
        return myDataList[position]
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
        var myConverterView=convertView
        if(myConverterView==null){
            myConverterView=LayoutInflater.from(ctx).inflate(R.layout.my_list_item, parent, false)
        }
        val currentItem=getItem(position)
        val imageItem=myConverterView?.findViewById<ImageView>(R.id.imageItem)
        val titleItem=myConverterView?.findViewById<TextView>(R.id.title)
        val description=myConverterView?.findViewById<TextView>(R.id.description)


        imageItem?.setImageResource(currentItem.Image)
        titleItem?.text=currentItem.title
        description?.text=currentItem.description
 return myConverterView!!
    }
}
