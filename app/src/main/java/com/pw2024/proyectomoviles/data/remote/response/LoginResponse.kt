package com.pw2024.proyectomoviles.data.remote.response

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class LoginResponse(
    @SerializedName(Constants.ACCESS_TOKEN)
    val accessToken: String,
    @SerializedName(Constants.ERROR)
    val error: String
)