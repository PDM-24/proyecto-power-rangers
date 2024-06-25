package com.pw2024.proyectomoviles.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(PostService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

object ApiClient {
    val apiService: PostService by lazy {
        RetrofitClient.retrofit.create(PostService::class.java)
    }
}