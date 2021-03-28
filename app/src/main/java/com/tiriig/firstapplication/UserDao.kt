package com.tiriig.firstapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user where id = :userId")
    fun getSingleUser(userId: Int): User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)
}