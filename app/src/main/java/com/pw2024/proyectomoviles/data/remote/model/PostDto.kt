package com.pw2024.proyectomoviles.data.remote.model

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants


data class PostDto(
    @SerializedName(Constants.DATE_PUBLISHED)
    val datePublished: String,
    @SerializedName(Constants.PUBLISHED_BY)
    val publishedBy: String,
    @SerializedName(Constants.TRANSACTION_TYPE)
    val transactionType: String,
    @SerializedName(Constants.BOOK)
    val bookDto: BookDto,
    @SerializedName(Constants.IMAGE)
    val imageDto: ImageDto
)