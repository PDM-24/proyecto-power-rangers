package com.pw2024.proyectomoviles.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pw2024.proyectomoviles.data.local.dao.TokenDao
import com.pw2024.proyectomoviles.data.local.entity.TokenEntity

@Database(
    entities = [TokenEntity::class],
    version = 1
)
abstract class AuroraDatabase : RoomDatabase() {
    abstract fun tokenDao(): TokenDao

    companion object {
        @Volatile
        private var INSTANCE: AuroraDatabase? = null

        fun getDatabase(context: Context): AuroraDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AuroraDatabase::class.java,
                    "aurora_db"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}