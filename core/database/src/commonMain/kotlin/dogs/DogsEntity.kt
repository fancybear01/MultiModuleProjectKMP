package com.coding.projectkmp.core.database.dogs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DogEntity(
    @PrimaryKey val url: String,
)