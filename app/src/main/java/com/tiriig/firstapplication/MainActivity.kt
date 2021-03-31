package com.tiriig.firstapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

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
            db.userDao().insert(User(0,
                    name.text.toString(),
                    phone.text.toString(),
                    email.text.toString()
            ))
        }.start()
    }
}