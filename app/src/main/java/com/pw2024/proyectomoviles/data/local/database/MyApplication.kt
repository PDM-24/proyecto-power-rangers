package com.pw2024.proyectomoviles.data.local.database

import android.app.Application
import androidx.room.Room

class MyApplication: Application() {
    companion object {
        lateinit var database: AuroraDatabase
    }
    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            this,
            AuroraDatabase::class.java,
            "CoursesDatabase"
        ).fallbackToDestructiveMigration().build()
    }
}