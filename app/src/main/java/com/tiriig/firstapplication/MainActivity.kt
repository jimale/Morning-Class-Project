package com.tiriig.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.mySpinner)

        val languages = arrayOf("Select language","Kotlin","Java","Node js","Php")

        val data = ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)

        spinner.adapter = data


        val mybutton = findViewById<Button>(R.id.saveUser)
        val  editText = findViewById<EditText>(R.id.myEditText)

        mybutton.setOnClickListener {
            val gotoDisplay = Intent(this,DisplayActivity::class.java)
            gotoDisplay.putExtra("name",editText.text.toString())
            startActivity(gotoDisplay)
        }
    }

}