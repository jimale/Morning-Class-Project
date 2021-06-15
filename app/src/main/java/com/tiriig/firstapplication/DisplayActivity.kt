package com.tiriig.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DisplayActivity : AppCompatActivity() {

    private val adapter = DisplayAdapter()
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        val users = ArrayList<User>()
        users.add(User(1,"Mohamed Ali","46282932","mohamed@gmail.com"))
        users.add(User(2,"Ahmed Jama","72322932","ahmed@gmail.com"))
        users.add(User(3,"Ali Ali","34282932","ali@gmail.com"))



        recyclerView = findViewById(R.id.displayRecyclerView)
        adapter.submitList(users)
        recyclerView.adapter = adapter

    }
}