package com.tiriig.firstapplication

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user: List<User>)

    @Query("SELECT * FROM user")
    fun getUsers(): List<User>

    @Query("SELECT phone FROM user where id =:id")
    fun getPhoneNumber(id: String): String

}