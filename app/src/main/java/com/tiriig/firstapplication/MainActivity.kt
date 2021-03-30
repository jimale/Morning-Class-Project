package com.tiriig.firstapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var firstName: TextView
    private lateinit var lastName: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.mySpinner)

        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)

        val languages = arrayOf("Select language","Kotlin","Java","Node js","Php")

        val data = ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)

        spinner.adapter = data


        val mybutton = findViewById<Button>(R.id.saveUser)
        val  editText = findViewById<EditText>(R.id.myEditText)

        mybutton.setOnClickListener {
            Thread{

                val db = MyDatabase.invoke(this)
                //delete user
                db.userDao().deleteUser(2)
                //update user
                db.userDao().update("Mohamed",1)
            }.start()
        }
    }

}