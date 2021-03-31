package com.tiriig.firstapplication

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name : String,
    val phone: String,
    val email: String
)
