package com.tiriig.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybutton = findViewById<Button>(R.id.saveUser)
        val  editText = findViewById<EditText>(R.id.myEditText)

        mybutton.setOnClickListener {
            val gotoDisplay = Intent(this,DisplayActivity::class.java)
            gotoDisplay.putExtra("name",editText.text.toString())
            startActivity(gotoDisplay)
        }
    }

}