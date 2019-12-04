package com.example.kotlinapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapp.R
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class RecyclerViewAdapter(val list: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nome = list.get(position)
        holder.onBind(nome)
    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun onBind(nome: String){

            itemView.text_view_nome.text = nome
        }

    }
}