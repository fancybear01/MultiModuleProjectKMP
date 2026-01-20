package com.coding.projectkmp.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.coding.projectkmp.core.database.dogs.DogEntity
import com.coding.projectkmp.core.database.dogs.DogsDao

@Database(
    entities = [
        DogEntity::class,
    ],
    version = DATABASE_VERSION
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dogsDao(): DogsDao
}

private const val DATABASE_VERSION = 1