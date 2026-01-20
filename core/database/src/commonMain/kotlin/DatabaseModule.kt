package com.coding.projectkmp.core.database

import com.coding.projectkmp.core.database.dogs.DogsDao

val databaseModule
    get() = platformDatabaseModule(fileName = "database.db")
        .apply {
            single<DogsDao> { get<AppDatabase>().dogsDao() }
        }