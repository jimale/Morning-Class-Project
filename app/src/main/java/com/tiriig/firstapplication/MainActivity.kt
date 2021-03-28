package com.tiriig.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.room.Room

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
//            val gotoDisplay = Intent(this,DisplayActivity::class.java)
//            gotoDisplay.putExtra("name",editText.text.toString())
//            startActivity(gotoDisplay)

            Thread{
                val db = Room.databaseBuilder(
                        applicationContext,MyDatabase::class.java,
                        "myDatabase"
                ).build()
                val userDao = db.userDao()
//                val user = User(10,"Mohamed","Jama")
//
//              userDao.insert(user)

                val singleUser = userDao.getSingleUser(10)

                runOnUiThread {
                    firstName.text = "Firstname: "+singleUser.firstname
                    lastName.text = "LastName: "+singleUser.lastname
                }



            }.start()

        }
    }

}