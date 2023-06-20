package com.example.restapi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ServiceBuilder {

    private val client = OkHttpClient.Builder().build()
    private val retrofit = Retrofit.Builder().baseUrl("https://dummyjson.com/products/")
        .addConverterFactory(GsonConverterFactory.create()).client(client).build()
    // create Instance of Object
    fun<T>buildService(service:Class<T>):T{
        return retrofit.create(service)
    }
}