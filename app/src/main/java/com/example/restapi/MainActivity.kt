package com.example.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ApiResponse
import com.example.Products
import com.example.ServiceBuilder
import com.example.ServiceInterface
import com.example.sampleapplication.R
import com.example.sampleapplication.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var data=ArrayList<Products>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycleView.layoutManager = LinearLayoutManager(this)
        getAllProducts()
    }

    private fun getAllProducts() {
        val retrofit = ServiceBuilder.buildService((ServiceInterface::class.java))
//call from retrofit
        retrofit.getAllProducts().enqueue(object : retrofit2.Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                try {
val responseBody=response.body()!!
                    data=responseBody.products
                } catch (ex: java.lang.Exception) {
                    ex.printStackTrace()
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })


    }
}