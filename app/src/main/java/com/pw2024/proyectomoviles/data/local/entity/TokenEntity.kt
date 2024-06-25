package com.pw2024.proyectomoviles.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "token_table")
data class TokenEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "token")
    val accessToken: String
)