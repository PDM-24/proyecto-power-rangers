package com.pw2024.proyectomoviles.data.remote.request

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class LoginRequest(
    @SerializedName(Constants.USERNAME)
    val username: String,
    @SerializedName(Constants.PASSWORD)
    val password: String
)
