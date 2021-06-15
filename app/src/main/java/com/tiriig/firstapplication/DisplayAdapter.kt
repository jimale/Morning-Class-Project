package com.tiriig.firstapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DisplayAdapter : ListAdapter<User,DisplayAdapter.ViewHolder>(DisplayDiffCallBack()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisplayAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DisplayAdapter.ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view){


        val name : TextView = itemView.findViewById(R.id.name)
        val phone : TextView = itemView.findViewById(R.id.phone)
        val email : TextView = itemView.findViewById(R.id.email)

        fun bind(user: User){
            name.text = user.name
            phone.text = user.phone
            email.text = user.email
        }

    }

    class DisplayDiffCallBack: DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }

    }
}