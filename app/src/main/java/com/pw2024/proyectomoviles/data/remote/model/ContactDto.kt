package com.pw2024.proyectomoviles.data.remote.model

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class ContactDto(
    @SerializedName(Constants.PHONE_NUMBER)
    val phoneNumber: String?,
    @SerializedName(Constants.WHATSAPP)
    val whatsapp: String?,
    @SerializedName(Constants.FACEBOOK)
    val facebook: String?,
    @SerializedName(Constants.INSTAGRAM)
    val instagram: String?,
    @SerializedName(Constants.TWITTER)
    val twitter: String?
)