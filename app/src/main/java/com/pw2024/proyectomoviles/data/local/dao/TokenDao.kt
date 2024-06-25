package com.pw2024.proyectomoviles.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import com.pw2024.proyectomoviles.data.local.entity.TokenEntity

@Dao
interface TokenDao {
    @Insert
    suspend fun insertToken(tokenEntity: TokenEntity)

    @Query("SELECT * FROM token_table")
    suspend fun getToken(): TokenEntity

    @Query("DELETE FROM token_table")
    suspend fun deleteToken()
}