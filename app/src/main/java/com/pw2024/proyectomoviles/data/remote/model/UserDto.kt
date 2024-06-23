package com.pw2024.proyectomoviles.data.remote.model

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class UserDto(
    @SerializedName(Constants.NAME)
    val name: String,
    @SerializedName(Constants.USERNAME)
    val username: String,
    @SerializedName(Constants.PASSWORD)
    val password: String,
    @SerializedName(Constants.EMAIL)
    val email: String,
    @SerializedName(Constants.CONTACT)
    val contactDto: ContactDto,
    @SerializedName(Constants.RATING)
    val rating: Int,
    @SerializedName(Constants.IS_ACTIVE)
    val isActive: Boolean,
    @SerializedName(Constants.IS_ADMIN)
    val isAdmin: Boolean
)