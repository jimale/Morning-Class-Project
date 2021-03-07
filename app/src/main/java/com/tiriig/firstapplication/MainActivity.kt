package com.tiriig.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var mybutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.name)
        mybutton = findViewById(R.id.saveUser)

        mybutton.setOnClickListener {

            myTextView.text = "We changed the text"
        }
    }
}