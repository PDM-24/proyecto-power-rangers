package com.pw2024.proyectomoviles.data.remote.api

import com.pw2024.proyectomoviles.data.remote.request.LoginRequest
import com.pw2024.proyectomoviles.data.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface PostService {
    @Headers(value = ["Content-Type: application/json"])
    @POST("/api/users/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    companion object {
        const val BASE_URL = "http://10.0.2.2:3000/"
    }
}