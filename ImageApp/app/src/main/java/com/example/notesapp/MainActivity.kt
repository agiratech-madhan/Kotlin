package com.example.notesapp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.ListView
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myListData= mutableListOf<MyData>()
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
        myListData.add(MyData(R.drawable.sam,"First Title","THis is the Sample Definition"))
val myListView=findViewById<ListView>(R.id.my_list_item)
        myListView.adapter=MyAdapter(this, myListData)
//        val imageView=findViewById<ImageView>(R.id.imageView)
//        val executor=Executors.newSingleThreadExecutor()
//        val handler= Handler(Looper.getMainLooper())
//        var image:Bitmap?=null
//        executor.execute {
//            var imageUrl="https://play-lh.googleusercontent.com/1-hPxafOxdYpYZEOKzNIkSP43HXCNftVJVttoo4ucl7rsMASXW3Xr6GlXURCubE1tA=w3840-h2160-rw"
//
//                try {
//val `in`=java.net.URL(imageUrl).openStream()
//                    image=BitmapFactory.decodeStream(`in`)
//                    handler.post{
//                        imageView.setImageBitmap(image)
//                    }
//
//                }
//catch (e:java.lang.Exception){
//    e.printStackTrace()
//}
//        }
    }
}