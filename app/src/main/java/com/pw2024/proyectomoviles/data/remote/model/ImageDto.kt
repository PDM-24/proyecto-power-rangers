package com.pw2024.proyectomoviles.data.remote.model

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class ImageDto(
    @SerializedName(Constants.PUBLIC_ID)
    val publicId: String?,
    @SerializedName(Constants.URL)
    val url: String?
)
