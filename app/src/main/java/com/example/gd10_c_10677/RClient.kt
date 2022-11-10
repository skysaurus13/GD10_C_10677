package com.example.gd10_c_10677

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RClient {
    private const val BASE_URL = "http://localhost:8080"
    val instance:api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}