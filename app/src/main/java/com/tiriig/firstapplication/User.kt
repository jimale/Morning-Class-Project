package com.tiriig.firstapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val id: Int,
    val firstname : String,
    val lastname: String
)
