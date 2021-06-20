package com.tiriig.firstapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private lateinit var name : EditText
    private lateinit var phone : EditText
    private lateinit var email : EditText

    private lateinit var saveButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        phone = findViewById(R.id.phone)
        email = findViewById(R.id.email)
        saveButton = findViewById(R.id.saveUser)

        saveButton.setOnClickListener {
            saveUser()
        }

    }

    fun saveUser(){
        Thread{

            val db = MyDatabase.invoke(this)

            val users = ArrayList<User>()
            users.add(User(1,"Mohamed Ali","46282932","mohamed@gmail.com"))
            users.add(User(2,"Ahmed Jama","72322932","ahmed@gmail.com"))
            users.add(User(3,"Ali Ali","34282932","ali@gmail.com"))

            db.userDao().insert(users)

        }.start()
    }
}