package com.tiriig.firstapplication

import androidx.room.*

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user where id = :userId")
    fun getSingleUser(userId: Int): User

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user: User)

    @Query("DELETE FROM user where id = :userId")
    fun deleteUser(userId: Int)

    @Query("UPDATE user set firstname = :name where id =:userId")
    fun update(name: String,userId: Int)
}