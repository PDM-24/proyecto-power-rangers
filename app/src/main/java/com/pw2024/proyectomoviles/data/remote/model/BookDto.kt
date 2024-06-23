package com.pw2024.proyectomoviles.data.remote.model

import com.google.gson.annotations.SerializedName
import com.pw2024.proyectomoviles.util.Constants

data class BookDto(
    @SerializedName(Constants.TITLE)
    val title: String,
    @SerializedName(Constants.AUTHOR)
    val author: String,
    @SerializedName(Constants.CONDITION)
    val condition: String,
    @SerializedName(Constants.SYNOPSIS)
    val synopsis: String,
    @SerializedName(Constants.GENRE)
    val genre: String,
    @SerializedName(Constants.YEAR_PUBLISHED)
    val yearPublished: String,
    @SerializedName(Constants.PAGES)
    val pages: String,
    @SerializedName(Constants.ISBN)
    val isbn: String,
    @SerializedName(Constants.PUBLISHER)
    val publisher: String,
    @SerializedName(Constants.LANGUAGE)
    val language: String,
    @SerializedName(Constants.PRICE)
    val price: Int
)